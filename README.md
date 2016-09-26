# Use [Kuromoji](https://github.com/atilika/kuromoji) and UniDic from JVM Clojure

## Install
Follow instructions for lein at http://leiningen.org/#install.

## Create
```
$ lein new app clojure-kuromoji
$ cd clojure-kuromoji
```

## Replace
Replace `project.clj` and `src/clojure_kuromoji/core.clj` with the two files in this gist.

## Get dependencies
```
$ lein deps
```
This downloads a bunch of stuff.

## Run
```
$ lein run
```
Here’s a snippet of the resulting EDN printout:
```clojure
({:all-features
  ["接頭辞"
   "*"
   "*"
   "*"
   "*"
   "*"
   "オ"
   "御"
   "お"
   "オ"
   "お"
   "オ"
   "和"
   "*"
   "*"
   "促添"
   "基本形"],
  :conjugation [:uninflected],
  :conjugation-type [],
  :final-sound-alternation-form "基本形",
  :final-sound-alternation-type "促添",
  :initial-sound-alternation-form "*",
  :initial-sound-alternation-type "*",
  :known? true,
  :language-type "和",
  :lemma "御",
  :lemma-pronunciation "オ",
  :lemma-reading "オ",
  :literal "お",
  :literal-pronunciation "オ",
  :part-of-speech [:prefix],
  :position 0,
  :user? false,
  :written-base-form "お",
  :written-form "お"}
; ... snip ✂ ...
)
```
This is Kuromoji’s tokenization of 「お寿司が食べたい。」 using UniDic.

(For full output, see [`full-output.edn`](https://gist.github.com/fasiha/d1e521c84b093e9756455d82f6482a38#file-full-output-edn).)

## Abbreviated tokenization
Here’s a subset of the above tokenized data for easier digestion. Again, it’s Kuromoji/UniDic’s tokenization of 「お寿司が食べたい。」.

| literal   | lemma    | part of speech                    | conjugation                | conjugation type                       |
|---|---|---|---|---|
| お        | 御       | [:prefix]                         | [:uninflected]             | []                                     |
| 寿司      | 寿司     | [:noun :common :general]          | [:uninflected]             | []                                     |
| が        | が       | [:particle :case]                 | [:uninflected]             | []                                     |
| 食べ      | 食べる   | [:verb :general]                  | [:continuative :general]   | [:shimoichidan-verb-e-row :ba-column]  |
| たい      | たい     | [:auxiliary-verb]                 | [:conclusive :general]     | [:auxiliary :tai]                      |
| 。        | 。       | [:supplementary-symbol :period]   | [:uninflected]             | []                                     |

## P.S. IPADIC

In principle you can replace UniDic with IPADIC but that dictionary gives a *different* API for `Token` from UniDic’s, so adjust `core.clj` accordingly.

## Kuromoji 1.0-SNAPSHOT
First, install [Maven](http://maven.apache.org/install.html) (or just `$ brew install maven` on macOS). Then:
```
# In a top-level directory, outside this repo
$ git clone https://github.com/atilika/kuromoji.git
$ cd kuromoji
$ mvn package -DskipDownloadWikipedia -pl kuromoji-unidic -am
$ mkdir /PATH/TO/demo-clojure-kuromoji/resources/jars
$ cp -p `find -name "*.jar"` /PATH/TO/demo-clojure-kuromoji/resources/jars/
```
I appended the HEAD commit to the name of the `jars` directory, so the JARs go to `resources/jars-1fad6cc5e27`. See http://stackoverflow.com/q/2404426/500207 for alternatives.

