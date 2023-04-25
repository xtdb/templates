# {{raw-name}}

{{description}}

## Usage

To start a REPL, run `clj`.
If you're running JDK 16+, you'll need to run `clj -A:jdk16+`.

Once the REPL starts, you'll have access to a started, in-memory XTDB node at `user/node` - e.g.:

```
user> node
;; => <XtdbNode>

user> (xt/status node)
;; => {:latest-completed-tx nil, :latest-submitted-tx nil}

user> (xt/submit-tx node [[:put :docs {:xt/id :my-doc, :version 0}]])
;; => #xt/tx-key {:tx-id 0, :sys-time #time/instant "2023-04-25T12:00:00Z"}

user> (xt/q node '{:find [version], :where [($ :docs [{:xt/id :my-doc} version])]})
;; => [{:version 0}]
```

Have fun!

For more information and documentation on XTDB 2.x, head to https://xtdb.com/v2
