let s:config={
\ 'insert':{
\   'right':[["#1e222c","#169ec4"],["#1e222c","#56c7ee"],],
\   'middle':[["#1e222c","#bcebfe"],],
\   'left':[["#1e222c","#169ec4"],["#1e222c","#56c7ee"],],},
\ 'replace':{
\   'right':[["#1e222c","#e242ac"],["#1e222c","#fe7ecd"],],
\   'middle':[["#1e222c","#ffc3e4"],],
\   'left':[["#1e222c","#e242ac"],["#1e222c","#fe7ecd"],],},
\ 'tabline':{
\   'right':[["#1e222c","#996ddb"],["#2a303b","#c398fe"],],
\   'middle':[["#c3d5ec","#1e222c"],],
\   'tabsel':[["#1e222c","#996ddb"],],
\   'left':[["#c3d5ec","#3b4351"],],},
\ 'normal':{
\   'warning':[["#996ddb","#3b4351"],],
\   'right':[["#1e222c","#537dd5"],["#1e222c","#8baafe"],],
\   'error':[["#e91e63","#2a303b"],],
\   'middle':[["#1e222c","#c9d4fd"],],
\   'left':[["#1e222c","#537dd5"],["#1e222c","#8baafe"],],},
\ 'visual':{
\   'right':[["#1e222c","#996ddb"],["#1e222c","#c398fe"],],
\   'middle':[["#1e222c","#e2ccfe"],],
\   'left':[["#1e222c","#996ddb"],["#1e222c","#c398fe"],],},
\}
let g:lightline#colorscheme#hydrangea#palette = lightline#colorscheme#fill(s:config)