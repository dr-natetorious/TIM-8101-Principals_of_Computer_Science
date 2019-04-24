public abstract class ryey.easer.core.ui.data.c<T> extends android.support.v4.app.i {
  protected T a;

  public ryey.easer.core.ui.data.c();
    Code:
       0: aload_0
       1: invokespecial #14                 // Method android/support/v4/app/i."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #16                 // Field a:Ljava/lang/Object;
       9: return

  protected abstract void a(T);

  public void a(boolean);
    Code:
       0: iload_1
       1: ifeq          14
       4: aload_0
       5: invokevirtual #23                 // Method getView:()Landroid/view/View;
       8: ldc           #24                 // int 2131230811
      10: invokevirtual #30                 // Method android/view/View.setBackgroundResource:(I)V
      13: return
      14: getstatic     #36                 // Field android/os/Build$VERSION.SDK_INT:I
      17: bipush        16
      19: if_icmplt     34
      22: aload_0
      23: invokevirtual #23                 // Method getView:()Landroid/view/View;
      26: aload_0
      27: getfield      #38                 // Field b:Landroid/graphics/drawable/Drawable;
      30: invokevirtual #42                 // Method android/view/View.setBackground:(Landroid/graphics/drawable/Drawable;)V
      33: return
      34: aload_0
      35: invokevirtual #23                 // Method getView:()Landroid/view/View;
      38: aload_0
      39: getfield      #38                 // Field b:Landroid/graphics/drawable/Drawable;
      42: invokevirtual #45                 // Method android/view/View.setBackgroundDrawable:(Landroid/graphics/drawable/Drawable;)V
      45: return

  public void b(T);
    Code:
       0: aload_1
       1: ifnull        21
       4: aload_0
       5: aload_1
       6: putfield      #16                 // Field a:Ljava/lang/Object;
       9: aload_0
      10: invokevirtual #23                 // Method getView:()Landroid/view/View;
      13: ifnull        21
      16: aload_0
      17: aload_1
      18: invokevirtual #47                 // Method a:(Ljava/lang/Object;)V
      21: return

  public void onViewCreated(android.view.View, android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #55                 // Method android/view/View.getBackground:()Landroid/graphics/drawable/Drawable;
       5: putfield      #38                 // Field b:Landroid/graphics/drawable/Drawable;
       8: aload_0
       9: getfield      #16                 // Field a:Ljava/lang/Object;
      12: ifnull        23
      15: aload_0
      16: aload_0
      17: getfield      #16                 // Field a:Ljava/lang/Object;
      20: invokevirtual #47                 // Method a:(Ljava/lang/Object;)V
      23: return
}
