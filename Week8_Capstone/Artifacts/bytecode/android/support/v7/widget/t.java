class android.support.v7.widget.t extends android.widget.PopupWindow {
  static {};
    Code:
       0: getstatic     #15                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmpge     13
       8: iconst_1
       9: istore_0
      10: goto          15
      13: iconst_0
      14: istore_0
      15: iload_0
      16: putstatic     #17                 // Field a:Z
      19: return

  public android.support.v7.widget.t(android.content.Context, android.util.AttributeSet, int, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iload         4
       6: invokespecial #22                 // Method android/widget/PopupWindow."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;II)V
       9: aload_0
      10: aload_1
      11: aload_2
      12: iload_3
      13: iload         4
      15: invokespecial #24                 // Method a:(Landroid/content/Context;Landroid/util/AttributeSet;II)V
      18: return

  public void showAsDropDown(android.view.View, int, int);
    Code:
       0: iload_3
       1: istore        4
       3: getstatic     #17                 // Field a:Z
       6: ifeq          27
       9: iload_3
      10: istore        4
      12: aload_0
      13: getfield      #62                 // Field b:Z
      16: ifeq          27
      19: iload_3
      20: aload_1
      21: invokevirtual #75                 // Method android/view/View.getHeight:()I
      24: isub
      25: istore        4
      27: aload_0
      28: aload_1
      29: iload_2
      30: iload         4
      32: invokespecial #77                 // Method android/widget/PopupWindow.showAsDropDown:(Landroid/view/View;II)V
      35: return

  public void showAsDropDown(android.view.View, int, int, int);
    Code:
       0: iload_3
       1: istore        5
       3: getstatic     #17                 // Field a:Z
       6: ifeq          27
       9: iload_3
      10: istore        5
      12: aload_0
      13: getfield      #62                 // Field b:Z
      16: ifeq          27
      19: iload_3
      20: aload_1
      21: invokevirtual #75                 // Method android/view/View.getHeight:()I
      24: isub
      25: istore        5
      27: aload_0
      28: aload_1
      29: iload_2
      30: iload         5
      32: iload         4
      34: invokespecial #80                 // Method android/widget/PopupWindow.showAsDropDown:(Landroid/view/View;III)V
      37: return

  public void update(android.view.View, int, int, int, int);
    Code:
       0: iload_3
       1: istore        6
       3: getstatic     #17                 // Field a:Z
       6: ifeq          27
       9: iload_3
      10: istore        6
      12: aload_0
      13: getfield      #62                 // Field b:Z
      16: ifeq          27
      19: iload_3
      20: aload_1
      21: invokevirtual #75                 // Method android/view/View.getHeight:()I
      24: isub
      25: istore        6
      27: aload_0
      28: aload_1
      29: iload_2
      30: iload         6
      32: iload         4
      34: iload         5
      36: invokespecial #84                 // Method android/widget/PopupWindow.update:(Landroid/view/View;IIII)V
      39: return
}
