# XTDB playground templates

This is a repo containing [deps-new](https://github.com/seancorfield/deps-new) templates to create an XTDB 2.x playground.

## Usage

Assuming you have installed `deps-new` as your `new` "tool" via:

```bash
clojure -Ttools install io.github.seancorfield/deps-new '{:git/tag "v0.5.1"}' :as new
```

* To create an in-process node playground, run:

  ``` shell
  clojure -Sdeps '{:deps {io.github.xtdb/templates {:git/tag "main", :git/sha "..."}}}' -Tnew create :template xtdb/node-playground :name my-xtdb-playground
  ```

## License

Copyright © 2023 JUXT Ltd

Distributed under the MIT Licence
