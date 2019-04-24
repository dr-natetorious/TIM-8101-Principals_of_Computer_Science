public abstract class android.support.v7.e.a.c<T, VH extends android.support.v7.widget.RecyclerView$x> extends android.support.v7.widget.RecyclerView$a<VH> {
  protected android.support.v7.e.a.c(android.support.v7.g.c$c<T>);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method android/support/v7/widget/RecyclerView$a."<init>":()V
       4: aload_0
       5: new           #15                 // class android/support/v7/e/a/b
       8: dup
       9: new           #17                 // class android/support/v7/g/a
      12: dup
      13: aload_0
      14: invokespecial #20                 // Method android/support/v7/g/a."<init>":(Landroid/support/v7/widget/RecyclerView$a;)V
      17: new           #22                 // class android/support/v7/e/a/a$a
      20: dup
      21: aload_1
      22: invokespecial #24                 // Method android/support/v7/e/a/a$a."<init>":(Landroid/support/v7/g/c$c;)V
      25: invokevirtual #27                 // Method android/support/v7/e/a/a$a.a:()Landroid/support/v7/e/a/a;
      28: invokespecial #30                 // Method android/support/v7/e/a/b."<init>":(Landroid/support/v7/g/d;Landroid/support/v7/e/a/a;)V
      31: putfield      #32                 // Field a:Landroid/support/v7/e/a/b;
      34: return

  public int a();
    Code:
       0: aload_0
       1: getfield      #32                 // Field a:Landroid/support/v7/e/a/b;
       4: invokevirtual #39                 // Method android/support/v7/e/a/b.a:()Ljava/util/List;
       7: invokeinterface #44,  1           // InterfaceMethod java/util/List.size:()I
      12: ireturn

  public void a(java.util.List<T>);
    Code:
       0: aload_0
       1: getfield      #32                 // Field a:Landroid/support/v7/e/a/b;
       4: aload_1
       5: invokevirtual #47                 // Method android/support/v7/e/a/b.a:(Ljava/util/List;)V
       8: return

  protected T c(int);
    Code:
       0: aload_0
       1: getfield      #32                 // Field a:Landroid/support/v7/e/a/b;
       4: invokevirtual #39                 // Method android/support/v7/e/a/b.a:()Ljava/util/List;
       7: iload_1
       8: invokeinterface #53,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      13: areturn
}
