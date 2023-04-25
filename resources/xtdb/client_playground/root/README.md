# {{raw-name}}

{{description}}

## Usage

If you don't already have an XTDB 2.x server running, you can start one with:

``` shell
docker pull ghcr.io/xtdb/xtdb-ea

docker run -tip 3000:3000 ghcr.io/xtdb/xtdb-ea
```

To start a REPL, run `clj`.

Once the REPL starts, you'll have access to an XTDB client at `user/client` - e.g.:

```
user> client
;; => #xtdb.client.XtdbClient{...}

user> (xt/status client)
;; => {:latest-completed-tx nil, :latest-submitted-tx nil}

user> (xt/submit-tx client [[:put :docs {:xt/id :my-doc, :version 0}]])
;; => #xt/tx-key {:tx-id 0, :sys-time #time/instant "2023-04-25T12:00:00Z"}

user> (xt/q client '{:find [version], :where [($ :docs [{:xt/id :my-doc} version])]})
;; => [{:version 0}]
```

Have fun!

For more information and documentation on XTDB 2.x, head to https://xtdb.com/v2
