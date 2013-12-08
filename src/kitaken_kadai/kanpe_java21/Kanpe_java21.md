##Q. kanpe07
 ArrayList\<String> array = new ArrayList<>()の意味

##A.

### ArrayListとは

大きさの決まっていない配列のこと。初期サイズは10だが、不足すれば自動的に拡張する。

### 使い方

```
ArrayList<型> 変数 = new ArrayList<型>();
```

とすると、<>内に指定された型のArrayListのinstanceが変数へ代入される。
このとき、

```
ArrayList<型> 変数名 = new ArrayList<>();
```
と省略して書くこともできる。

よって、

```
 ArrayList<String> array = new ArrayList<>()
```
の意味は、**String型ArrayListのinstanceを変数arrayへ代入する**となる。

### 参考サイト
* [Java7 ジェネリクスのダイアモンド・オペレータ - プログラマーの脳みそ](http://d.hatena.ne.jp/Nagise/20110729/1311950039)