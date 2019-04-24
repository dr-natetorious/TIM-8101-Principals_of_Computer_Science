public class android.support.v7.widget.RecyclerView$f$c {
  public int a;

  public int b;

  public int c;

  public int d;

  public android.support.v7.widget.RecyclerView$f$c();
    Code:
       0: aload_0
       1: invokespecial #18                 // Method java/lang/Object."<init>":()V
       4: return

  public android.support.v7.widget.RecyclerView$f$c a(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: aload_1
       2: iconst_0
       3: invokevirtual #23                 // Method a:(Landroid/support/v7/widget/RecyclerView$x;I)Landroid/support/v7/widget/RecyclerView$f$c;
       6: areturn

  public android.support.v7.widget.RecyclerView$f$c a(android.support.v7.widget.RecyclerView$x, int);
    Code:
       0: aload_1
       1: getfield      #28                 // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
       4: astore_1
       5: aload_0
       6: aload_1
       7: invokevirtual #34                 // Method android/view/View.getLeft:()I
      10: putfield      #36                 // Field a:I
      13: aload_0
      14: aload_1
      15: invokevirtual #39                 // Method android/view/View.getTop:()I
      18: putfield      #41                 // Field b:I
      21: aload_0
      22: aload_1
      23: invokevirtual #44                 // Method android/view/View.getRight:()I
      26: putfield      #46                 // Field c:I
      29: aload_0
      30: aload_1
      31: invokevirtual #49                 // Method android/view/View.getBottom:()I
      34: putfield      #51                 // Field d:I
      37: aload_0
      38: areturn
}
