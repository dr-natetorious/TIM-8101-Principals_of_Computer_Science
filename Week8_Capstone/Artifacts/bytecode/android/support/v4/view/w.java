public final class android.support.v4.view.w {
  static final android.support.v4.view.w$c a;

  static {};
    Code:
       0: getstatic     #22                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     21
       8: new           #9                  // class android/support/v4/view/w$b
      11: dup
      12: invokespecial #25                 // Method android/support/v4/view/w$b."<init>":()V
      15: astore_0
      16: aload_0
      17: putstatic     #27                 // Field a:Landroid/support/v4/view/w$c;
      20: return
      21: getstatic     #22                 // Field android/os/Build$VERSION.SDK_INT:I
      24: bipush        19
      26: if_icmplt     40
      29: new           #6                  // class android/support/v4/view/w$a
      32: dup
      33: invokespecial #28                 // Method android/support/v4/view/w$a."<init>":()V
      36: astore_0
      37: goto          16
      40: new           #12                 // class android/support/v4/view/w$c
      43: dup
      44: invokespecial #29                 // Method android/support/v4/view/w$c."<init>":()V
      47: astore_0
      48: goto          16

  public static void a(android.view.ViewParent, android.view.View, int);
    Code:
       0: aload_0
       1: instanceof    #33                 // class android/support/v4/view/n
       4: ifeq          19
       7: aload_0
       8: checkcast     #33                 // class android/support/v4/view/n
      11: aload_1
      12: iload_2
      13: invokeinterface #36,  3           // InterfaceMethod android/support/v4/view/n.c:(Landroid/view/View;I)V
      18: return
      19: iload_2
      20: ifne          31
      23: getstatic     #27                 // Field a:Landroid/support/v4/view/w$c;
      26: aload_0
      27: aload_1
      28: invokevirtual #39                 // Method android/support/v4/view/w$c.a:(Landroid/view/ViewParent;Landroid/view/View;)V
      31: return

  public static void a(android.view.ViewParent, android.view.View, int, int, int, int, int);
    Code:
       0: aload_0
       1: instanceof    #33                 // class android/support/v4/view/n
       4: ifeq          26
       7: aload_0
       8: checkcast     #33                 // class android/support/v4/view/n
      11: aload_1
      12: iload_2
      13: iload_3
      14: iload         4
      16: iload         5
      18: iload         6
      20: invokeinterface #43,  7           // InterfaceMethod android/support/v4/view/n.a:(Landroid/view/View;IIIII)V
      25: return
      26: iload         6
      28: ifne          45
      31: getstatic     #27                 // Field a:Landroid/support/v4/view/w$c;
      34: aload_0
      35: aload_1
      36: iload_2
      37: iload_3
      38: iload         4
      40: iload         5
      42: invokevirtual #46                 // Method android/support/v4/view/w$c.a:(Landroid/view/ViewParent;Landroid/view/View;IIII)V
      45: return

  public static void a(android.view.ViewParent, android.view.View, int, int, int[], int);
    Code:
       0: aload_0
       1: instanceof    #33                 // class android/support/v4/view/n
       4: ifeq          24
       7: aload_0
       8: checkcast     #33                 // class android/support/v4/view/n
      11: aload_1
      12: iload_2
      13: iload_3
      14: aload         4
      16: iload         5
      18: invokeinterface #50,  6           // InterfaceMethod android/support/v4/view/n.a:(Landroid/view/View;II[II)V
      23: return
      24: iload         5
      26: ifne          41
      29: getstatic     #27                 // Field a:Landroid/support/v4/view/w$c;
      32: aload_0
      33: aload_1
      34: iload_2
      35: iload_3
      36: aload         4
      38: invokevirtual #53                 // Method android/support/v4/view/w$c.a:(Landroid/view/ViewParent;Landroid/view/View;II[I)V
      41: return

  public static boolean a(android.view.ViewParent, android.view.View, float, float);
    Code:
       0: getstatic     #27                 // Field a:Landroid/support/v4/view/w$c;
       3: aload_0
       4: aload_1
       5: fload_2
       6: fload_3
       7: invokevirtual #56                 // Method android/support/v4/view/w$c.a:(Landroid/view/ViewParent;Landroid/view/View;FF)Z
      10: ireturn

  public static boolean a(android.view.ViewParent, android.view.View, float, float, boolean);
    Code:
       0: getstatic     #27                 // Field a:Landroid/support/v4/view/w$c;
       3: aload_0
       4: aload_1
       5: fload_2
       6: fload_3
       7: iload         4
       9: invokevirtual #59                 // Method android/support/v4/view/w$c.a:(Landroid/view/ViewParent;Landroid/view/View;FFZ)Z
      12: ireturn

  public static boolean a(android.view.ViewParent, android.view.View, android.view.View, int, int);
    Code:
       0: aload_0
       1: instanceof    #33                 // class android/support/v4/view/n
       4: ifeq          22
       7: aload_0
       8: checkcast     #33                 // class android/support/v4/view/n
      11: aload_1
      12: aload_2
      13: iload_3
      14: iload         4
      16: invokeinterface #63,  5           // InterfaceMethod android/support/v4/view/n.a:(Landroid/view/View;Landroid/view/View;II)Z
      21: ireturn
      22: iload         4
      24: ifne          38
      27: getstatic     #27                 // Field a:Landroid/support/v4/view/w$c;
      30: aload_0
      31: aload_1
      32: aload_2
      33: iload_3
      34: invokevirtual #66                 // Method android/support/v4/view/w$c.a:(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;I)Z
      37: ireturn
      38: iconst_0
      39: ireturn

  public static void b(android.view.ViewParent, android.view.View, android.view.View, int, int);
    Code:
       0: aload_0
       1: instanceof    #33                 // class android/support/v4/view/n
       4: ifeq          22
       7: aload_0
       8: checkcast     #33                 // class android/support/v4/view/n
      11: aload_1
      12: aload_2
      13: iload_3
      14: iload         4
      16: invokeinterface #70,  5           // InterfaceMethod android/support/v4/view/n.b:(Landroid/view/View;Landroid/view/View;II)V
      21: return
      22: iload         4
      24: ifne          37
      27: getstatic     #27                 // Field a:Landroid/support/v4/view/w$c;
      30: aload_0
      31: aload_1
      32: aload_2
      33: iload_3
      34: invokevirtual #73                 // Method android/support/v4/view/w$c.b:(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;I)V
      37: return
}
