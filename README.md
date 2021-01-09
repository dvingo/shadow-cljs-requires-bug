Goal: use @emotion/styled within react storybook.

If you include just emotion, things are fine and shadow builds this.

Once you add '@storybook/react' to package.json, @emotion/styled fails to be required.

Steps to reproduce.

First the working version:
```bash
yarn
yarn shadow-cljs watch main
```
open http://localhost:8044

view browser console to see `styled` being logged.

---
Error case:

Stop shadow-cljs.

```bash
yarn add @storybook/react
yarn
yarn shadow-cljs watch main
```

- broken (view browser console)

You can also see the error with:

yarn shadow-cljs browser-repl

```clojure
(require '["@emotion/styled"])
```
