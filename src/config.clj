(ns config)

; Palette
(def base03    "#1e222c") ; L* = 44
(def base02    "#2a303b") ; L* = 50
(def base01    "#3b4351") ; L* = 58
(def base00    "#586374") ; L* = 68
(def base2     "#c3d5ec") ; L* = 93
(def base3     "#edf5ff") ; L* = 99
(def red01     "#681c36")
(def red1      "#e91e63")
(def teal01    "#134242")
(def teal2     "#36c2c2")
(def cyan01    "#064253")
(def cyan1     "#169ec4")
(def cyan2     "#56c7ee")
(def cyan3     "#bcebfe")
(def blue1     "#537dd5")
(def blue2     "#8baafe")
(def blue3     "#c9d4fd")
(def violet1   "#996ddb")
(def violet2   "#c398fe")
(def violet3   "#e2ccfe")
(def magenta01 "#68024b")
(def magenta1  "#e242ac")
(def magenta2  "#fe7ecd")
(def magenta3  "#ffc3e4")
(def bold      "bold")
(def underline "underline")
(def undercurl "undercurl")
(def none      "NONE")
(def fg        "fg")
(def bg        "bg")

(def syntax-styles
 {:Normal          {:fg base2 :bg base03}
  :Cursor          {:fg none :bg base3 :deco bold}
  :CursorIM        {:fg none :bg base3}
  :CursorLine      {:fg none :bg base02}
  :CursorColumn    {:fg none :bg base02}
  :Visual          {:fg none :bg base01}
  :VisualNOS       {:deco underline}
  :Folded          {:fg base2 :bg base02}
  :FoldColumn      {:fg base2 :bg base03}
  :Title           {:fg magenta1 :bg none}
  :StatusLine      {:fg base2 :bg base01}
  :StatusLineNC    {:fg base00 :bg base02}
  :VertSplit       {:fg base02 :bg base02}
  :LineNr          {:fg base00 :bg base02}
  :CursorLineNr    {:fg base3 :bg base00 :deco bold}
  :SpecialKey      {:fg cyan01 :bg cyan1 :deco bold}
  :NonText         {:fg base00 :bg base03 :deco none}
  :MatchParen      {:fg red1 :bg none :deco bold}
  :Comment         {:fg base00 :deco none}
  :Constant        {:fg teal2 :bg teal01 :deco none}
  :Number          {:fg cyan2 :bg cyan01 :deco none}
  :Identifier      {:fg base3 :deco bold}
  :Function        {:fg base3 :deco bold}
  :Statement       {:fg blue1 :deco bold}
  :Operator        {:fg magenta1 :deco none}
  :Include         {:fg violet1 :deco none}
  :PreProc         {:fg violet2 :deco none}
  :Type            {:fg magenta1 :deco none}
  :StorageClass    {:fg blue1 :deco bold}
  :Structure       {:fg magenta1 :deco none}
  :Typedef         {:fg blue1 :deco bold}
  :Special         {:fg blue2 :bg none :deco bold}
  :Underlined      {:fg fg :deco underline}
  :Ignore          {:fg bg}
  :Error           {:fg red1 :bg red01 :deco bold}
  :Todo            {:fg base2 :bg base03 :deco bold}
  :IncSearch       {:fg base03 :bg cyan1 :deco bold}
  :Search          {:fg base03 :bg cyan2 :deco none}
  :Pmenu           {:fg base2 :bg base02 :deco none}
  :PmenuSel        {:fg base3 :bg base01 :deco bold}
  :PmenuSbar       {:bg base02 :deco none}
  :PmenuThumb      {:bg base00 :deco none}
  :TabLine         {:fg base2 :bg base03 :deco none}
  :TabLineSel      {:fg base03 :bg magenta1 :deco bold}
  :TabLineFill     {:fg base2 :bg base03 :deco none}
  :SpellBad        {:deco undercurl}
  :SpellCap        {:deco undercurl}
  :SpellRare       {:deco undercurl}
  :SpellLocal      {:deco undercurl}
  :DiffAdd         {:fg cyan1 :bg cyan01 :deco none}
  :DiffChange      {:fg magenta1 :bg magenta01 :deco none}
  :DiffDelete      {:fg magenta1 :bg magenta01 :deco none}
  :DiffText        {:fg magenta3 :bg magenta01 :deco bold}
  :diffAdded       {:fg cyan1 :bg cyan01 :deco none}
  :diffRemoved     {:fg magenta1 :bg magenta01 :deco none}
  :Directory       {:fg teal2 :deco none}
  :ErrorMsg        {:fg red1 :bg none :deco none}
  :SignColumn      {:fg base2 :bg base02 :deco none}
  :MoreMsg         {:fg blue1 :deco none}
  :ModeMsg         {:deco bold}
  :Question        {:fg fg :deco none}
  :WarningMsg      {:fg red1 :deco none}
  :WildMenu        {:fg base3 :bg base00 :deco bold}
  :ColorColumn     {:fg none :bg red01 :deco none}
  :GitGutterAdd    {:fg cyan1 :bg base02 :deco bold}
  :GitGutterChange {:fg magenta1 :bg base02 :deco bold}
  :GitGutterDelete {:fg magenta1 :bg base02 :deco bold}})

(def syntax-links
  {:String         :Constant
   :makeIdent      :Type
   :makeSpecTarget :Special
   :makeTarget     :Function})

(def terminal-colors
  [[:idk base03]
   [:error-red magenta2]
   [:cdh teal2]
   [:commit-yellow violet2]
   [:dirs cyan2]
   [:prompt-and-symb-links blue1]
   [:idk violet3]
   [:normal-text base3]
   [:highlighting-bkgd blue3]
   [:idk base03]
   [:idk base03]
   [:idk base03]
   [:previous-flags blue2]
   [:valid-command violet2]
   [:idk base03]
   [:idk base03]])

(def lightline-config
  {:normal
    {:left    [{:fg base03 :bg blue1} {:fg base03 :bg blue2}]
     :middle  [{:fg base03 :bg blue3}]
     :right   [{:fg base03 :bg blue1} {:fg base03 :bg blue2}]
     :error   [{:fg red1 :bg base02}]
     :warning [{:fg violet1 :bg base01}]}
   :insert
    {:left    [{:fg base03 :bg cyan1} {:fg base03 :bg cyan2}]
     :middle  [{:fg base03 :bg cyan3}]
     :right   [{:fg base03 :bg cyan1} {:fg base03 :bg cyan2}]}
   :visual
    {:left    [{:fg base03 :bg violet1} {:fg base03 :bg violet2}]
     :middle  [{:fg base03 :bg violet3}]
     :right   [{:fg base03 :bg violet1} {:fg base03 :bg violet2}]}
   :replace
    {:left    [{:fg base03 :bg magenta1} {:fg base03 :bg magenta2}]
     :middle  [{:fg base03 :bg magenta3}]
     :right   [{:fg base03 :bg magenta1} {:fg base03 :bg magenta2}]}
   :tabline
    {:left    [{:fg base2 :bg base01}]
     :middle  [{:fg base2 :bg base03}]
     :right   [{:fg base03 :bg violet1} {:fg base02 :bg violet2}]
     :tabsel  [{:fg base03 :bg violet1}]}})
