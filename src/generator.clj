(ns generator
  (:require [config :refer [colorscheme-name syntax-styles syntax-links terminal-colors lightline-config]]
            [clojure.string :as str]
            [clojure.java.io :as io]))

;; Syntax Highlighting Functions
(defn style->vimscript [[syntax-group style]]
  (let [guifg (when (:fg style)   (str " guifg=" (:fg style)))
        guibg (when (:bg style)   (str " guibg=" (:bg style)))
        gui   (when (:deco style) (str " gui=" (:deco style)))]
    (str "hi " (symbol syntax-group) guifg guibg gui)))

(defn link->vimscript [[syntax-group-1 syntax-group-2]]
  (str "hi link " (symbol syntax-group-1) " " (symbol syntax-group-2)))

;; Terminal Color Functions
(defn terminal-vimscript-command [index item]
  (str "let g:terminal_color_" index "  = '" (last item) "'"))

;; Lightline Functions
(defn keyword->vimscript-key [k]
  (str "'" (symbol k) "':"))

(defn lightline-style->vimscript [style]
  (str "[\"" (:fg style) "\",\"" (:bg style) "\"],"))

(defn position-config->vimscript [[position styles]]
  (let [inner (str/join
                (map lightline-style->vimscript styles))]
    (str "\\   " (keyword->vimscript-key position) "[" inner "],")))

(defn lightline-mode-config->vimscript [[mode mode-config]]
  (let [inner (str/join "\n"
                (map position-config->vimscript mode-config))]
    (str "\\ " (keyword->vimscript-key mode) "{\n" inner "},")))

;; Generate vimscript 
(def main-colorscheme-vimscript
  (str/join "\n"
   (concat
     ["\" Styles" "\" =========="]
     (map style->vimscript syntax-styles)
     ["" "\" Links" "\" =========="]
     (map link->vimscript syntax-links)
     ["" "\" Terminal Colors" "\" ==========="]
     (map-indexed terminal-vimscript-command terminal-colors)))) 

(def lightline-colorscheme-vimscript
  (str/join "\n"
    (concat
      ["let s:config={"]
      (map lightline-mode-config->vimscript lightline-config)
      ["\\}" (str "let g:lightline#colorscheme#" colorscheme-name "#palette = lightline#colorscheme#fill(s:config)")])))

;; Clear out existing colorschemes
(->>
  (.listFiles (io/file "colors"))
  (concat (.listFiles (io/file "autoload/lightline/colorscheme")))
  (run! io/delete-file))

;; Write vimscript to files
(def colorscheme-file-path (str "colors/" colorscheme-name ".vim"))
(spit colorscheme-file-path main-colorscheme-vimscript)
(println (str "Wrote to file: " colorscheme-file-path))

(def lightline-colorscheme-file-path (str "autoload/lightline/colorscheme/" colorscheme-name ".vim"))
(spit lightline-colorscheme-file-path lightline-colorscheme-vimscript)
(println (str "Wrote to file: " lightline-colorscheme-file-path))

