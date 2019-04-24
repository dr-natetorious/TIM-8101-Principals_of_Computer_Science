public final class android.support.v4.widget.k {
  static final android.support.v4.widget.k$d a;

  static {};
    Code:
       0: getstatic     #25                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        23
       5: if_icmplt     21
       8: new           #12                 // class android/support/v4/widget/k$c
      11: dup
      12: invokespecial #28                 // Method android/support/v4/widget/k$c."<init>":()V
      15: astore_0
      16: aload_0
      17: putstatic     #30                 // Field a:Landroid/support/v4/widget/k$d;
      20: return
      21: getstatic     #25                 // Field android/os/Build$VERSION.SDK_INT:I
      24: bipush        21
      26: if_icmplt     40
      29: new           #9                  // class android/support/v4/widget/k$b
      32: dup
      33: invokespecial #31                 // Method android/support/v4/widget/k$b."<init>":()V
      36: astore_0
      37: goto          16
      40: getstatic     #25                 // Field android/os/Build$VERSION.SDK_INT:I
      43: bipush        19
      45: if_icmplt     59
      48: new           #6                  // class android/support/v4/widget/k$a
      51: dup
      52: invokespecial #32                 // Method android/support/v4/widget/k$a."<init>":()V
      55: astore_0
      56: goto          16
      59: new           #15                 // class android/support/v4/widget/k$d
      62: dup
      63: invokespecial #33                 // Method android/support/v4/widget/k$d."<init>":()V
      66: astore_0
      67: goto          16

  public static void a(android.widget.PopupWindow, int);
    Code:
       0: getstatic     #30                 // Field a:Landroid/support/v4/widget/k$d;
       3: aload_0
       4: iload_1
       5: invokevirtual #37                 // Method android/support/v4/widget/k$d.a:(Landroid/widget/PopupWindow;I)V
       8: return

  public static void a(android.widget.PopupWindow, android.view.View, int, int, int);
    Code:
       0: getstatic     #30                 // Field a:Landroid/support/v4/widget/k$d;
       3: aload_0
       4: aload_1
       5: iload_2
       6: iload_3
       7: iload         4
       9: invokevirtual #40                 // Method android/support/v4/widget/k$d.a:(Landroid/widget/PopupWindow;Landroid/view/View;III)V
      12: return

  public static void a(android.widget.PopupWindow, boolean);
    Code:
       0: getstatic     #30                 // Field a:Landroid/support/v4/widget/k$d;
       3: aload_0
       4: iload_1
       5: invokevirtual #43                 // Method android/support/v4/widget/k$d.a:(Landroid/widget/PopupWindow;Z)V
       8: return
}
