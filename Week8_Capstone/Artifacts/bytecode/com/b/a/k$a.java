public class com.b.a.k$a {
  int a;

  int b;

  boolean c;

  com.b.a.g d;

  java.lang.String e;

  com.b.a.k$a(com.b.a.k$1);
    Code:
       0: aload_0
       1: invokespecial #32                 // Method "<init>":()V
       4: return

  public com.b.a.k a();
    Code:
       0: aload_0
       1: getfield      #35                 // Field d:Lcom/b/a/g;
       4: ifnonnull     18
       7: aload_0
       8: new           #37                 // class com/b/a/h
      11: dup
      12: invokespecial #38                 // Method com/b/a/h."<init>":()V
      15: putfield      #35                 // Field d:Lcom/b/a/g;
      18: new           #6                  // class com/b/a/k
      21: dup
      22: aload_0
      23: aconst_null
      24: invokespecial #41                 // Method com/b/a/k."<init>":(Lcom/b/a/k$a;Lcom/b/a/k$1;)V
      27: areturn
}
