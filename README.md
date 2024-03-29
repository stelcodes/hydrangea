neovim colorscheme generator
==============================
Configure neovim colors with clojure!

About
------------------------------
I use [neovim](https://neovim.io) & [conjure](https://conjure.fun) as the core of my clojure development setup. It's been magical. I've spent hours configuring my vim colorscheme, and I found a great colorscheme in the github repo [yuttie/hydrangea-vim](https://github.com/yuttie/hydrangea-vim) while browsing github search results. The author generated the VimL with a python script. Cool, but I found the code to be unecessarily complex and hard to configure after the fact. I tried to rewrite it in pure VimL but unfortuntely you can't save pass around color values easily. It's actually more ergonomic to use another language to produce the VimL. I've been getting *really* into Clojure in 2020 so I thought:
> "Can I maintain a radical vim colorscheme in comfy clojure land?" - stel's brain

Features
-----------------------------
* Create a (neo)vim colorscheme with clojure
* Simple: Configuration goes in `config.clj`, then execute `generator.clj`
* Support for setting syntax, integrated terminal, and [lightline](https://github.com/itchyny/lightline.vim) colorschemes!
* Use your fork of this repo as your very own vim package

Limitations
-----------------------------
* This code does not currently emit CTERM colors. So `termguicolors` must be enabled within neovim. This could be changed in future updates. PR's welcome.
* Maintaining multiple colorschemes is not supported out of the box. Each time the script is run all previous .vim files are deleted and replaced. The benefit is simplicity knowing you don't have any extra files hanging around.

Usage
------------------------------
1. Fork this repository
2. Clone onto your machine
3. Edit `config.clj` with your own color pallete and syntax assignments
4. Execute `generator.clj`

```bash
# with JVM clojure (~1500 ms)
clj -M src/generator.clj

# with babashka (~50 ms)
brew install borkdude/brew/babashka
bb -cp src/ src/generator.clj
```

5. Try the generated `.vim` files by opening them in neovim and running `:source %`
6. Push back to Github
7. Install your colorscheme with the neovim package manager of your choice

I use [vim-plug](https://github.com/junegunn/vim-plug):
```viml
Plug '<your-github-username>/neovim-colorscheme-generator'
```

8. Later in your init.vim, use your new colorschemes

```viml
" set colorscheme
colorscheme <your-colorscheme-name>

" If you're using lightline, include colorscheme in your config
let g:lightline = {
      \ 'colorscheme': '<your-colorscheme-name>',
      " ... the rest of your config ...
      \ }
```

## Contribution
Please feel free to fork, open issues, etc
