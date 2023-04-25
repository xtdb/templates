# XTDB playground templates

This is a repo containing [deps-new](https://github.com/seancorfield/deps-new) templates to create an XTDB 2.x playground.

## Usage

Assuming you have installed `deps-new` as your `new` "tool" via:

```bash
clojure -Ttools install io.github.seancorfield/deps-new '{:git/tag "v0.5.1"}' :as new
```

* To create an in-process node playground, run:

  ``` shell
  clojure -Sdeps '{:deps {io.github.xtdb/templates {:git/sha "7153b6fbf7a7dd52cdc44330eff3f7947a8bbdef"}}}' -Tnew create :template xtdb/node-playground :name my-xtdb-playground
  ```

* To create a thin-client playground, run:

  ``` shell
  clojure -Sdeps '{:deps {io.github.xtdb/templates {:git/sha "7153b6fbf7a7dd52cdc44330eff3f7947a8bbdef"}}}' -Tnew create :template xtdb/client-playground :name my-xtdb-playground
  ```
  
  If you don't already have an XTDB 2.x instance running, you can start one with Docker:
  
  ```shell
  docker pull ghcr.io/xtdb/xtdb-ea
  
  docker run -tip 3000:3000 ghcr.io/xtdb/xtdb-ea
  ```

Then, `cd my-xtdb-playground`, and follow the instructions in your new README!

For more information and documentation on XTDB 2.x, head to https://xtdb.com/v2.

## License

Copyright © 2023 JUXT Ltd

Distributed under the MIT License
