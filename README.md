sandboxed-cljs
==============

For running user-supplied ClojureScript code in a [vm2](https://github.com/patriksimek/vm2) sandbox.
For building REPL experience based on [Replumb](https://github.com/Lambda-X/replumb).

Requires Node 6 or later.

```js
var createRuntime = require('sandboxed-cljs')
var runtime = createRuntime()

// Returns a Promise that always resolves to a string.
// (If there is an error, it will also return a string representing the error.)
runtime.run(`
  (defn random-order
    [n]
    (->> (range n)
         (map inc)
         (shuffle)))
`)
// => "#'cljs.user/random-order"

runtime.run('(random-order 10)')
// => "[8 1 7 2 9 5 6 4 3 10]"
```
