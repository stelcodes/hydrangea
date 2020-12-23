let s:config={
\ 'normal':{
\   'left':[["#1e222c","#537dd5"],["#1e222c","#8baafe"],],
\   'middle':[["#1e222c","#c9d4fd"],],
\   'right':[["#1e222c","#537dd5"],["#1e222c","#8baafe"],],
\   'error':[["#e91e63","#2a303b"],],
\   'warning':[["#996ddb","#3b4351"],],},
\ 'insert':{
\   'left':[["#1e222c","#169ec4"],["#1e222c","#56c7ee"],],
\   'middle':[["#1e222c","#bcebfe"],],
\   'right':[["#1e222c","#169ec4"],["#1e222c","#56c7ee"],],},
\ 'visual':{
\   'left':[["#1e222c","#996ddb"],["#1e222c","#c398fe"],],
\   'middle':[["#1e222c","#e2ccfe"],],
\   'right':[["#1e222c","#996ddb"],["#1e222c","#c398fe"],],},
\ 'replace':{
\   'left':[["#1e222c","#e242ac"],["#1e222c","#fe7ecd"],],
\   'middle':[["#1e222c","#ffc3e4"],],
\   'right':[["#1e222c","#e242ac"],["#1e222c","#fe7ecd"],],},
\ 'tabline':{
\   'left':[["#c3d5ec","#3b4351"],],
\   'middle':[["#c3d5ec","#1e222c"],],
\   'right':[["#1e222c","#996ddb"],["#2a303b","#c398fe"],],
\   'tabsel':[["#1e222c","#996ddb"],],},
\}
let g:lightline#colorscheme#hydrangea#palette = lightline#colorscheme#fill(s:config)