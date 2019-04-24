public abstract class android.support.v7.widget.ba {
  protected final android.support.v7.widget.RecyclerView$i a;

  final android.graphics.Rect b;

  android.support.v7.widget.ba(android.support.v7.widget.RecyclerView$i, android.support.v7.widget.ba$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #33                 // Method "<init>":(Landroid/support/v7/widget/RecyclerView$i;)V
       5: return

  public static android.support.v7.widget.ba a(android.support.v7.widget.RecyclerView$i);
    Code:
       0: new           #6                  // class android/support/v7/widget/ba$1
       3: dup
       4: aload_0
       5: invokespecial #35                 // Method android/support/v7/widget/ba$1."<init>":(Landroid/support/v7/widget/RecyclerView$i;)V
       8: areturn

  public static android.support.v7.widget.ba a(android.support.v7.widget.RecyclerView$i, int);
    Code:
       0: iload_1
       1: tableswitch   { // 0 to 1
                     0: 39
                     1: 34
               default: 24
          }
      24: new           #38                 // class java/lang/IllegalArgumentException
      27: dup
      28: ldc           #40                 // String invalid orientation
      30: invokespecial #43                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      33: athrow
      34: aload_0
      35: invokestatic  #45                 // Method b:(Landroid/support/v7/widget/RecyclerView$i;)Landroid/support/v7/widget/ba;
      38: areturn
      39: aload_0
      40: invokestatic  #47                 // Method a:(Landroid/support/v7/widget/RecyclerView$i;)Landroid/support/v7/widget/ba;
      43: areturn

  public static android.support.v7.widget.ba b(android.support.v7.widget.RecyclerView$i);
    Code:
       0: new           #8                  // class android/support/v7/widget/ba$2
       3: dup
       4: aload_0
       5: invokespecial #48                 // Method android/support/v7/widget/ba$2."<init>":(Landroid/support/v7/widget/RecyclerView$i;)V
       8: areturn

  public abstract int a(android.view.View);

  public void a();
    Code:
       0: aload_0
       1: aload_0
       2: invokevirtual #53                 // Method f:()I
       5: putfield      #22                 // Field c:I
       8: return

  public abstract void a(int);

  public int b();
    Code:
       0: ldc           #20                 // int -2147483648
       2: aload_0
       3: getfield      #22                 // Field c:I
       6: if_icmpne     11
       9: iconst_0
      10: ireturn
      11: aload_0
      12: invokevirtual #53                 // Method f:()I
      15: aload_0
      16: getfield      #22                 // Field c:I
      19: isub
      20: ireturn

  public abstract int b(android.view.View);

  public abstract int c();

  public abstract int c(android.view.View);

  public abstract int d();

  public abstract int d(android.view.View);

  public abstract int e();

  public abstract int e(android.view.View);

  public abstract int f();

  public abstract int f(android.view.View);

  public abstract int g();

  public abstract int h();

  public abstract int i();
}
