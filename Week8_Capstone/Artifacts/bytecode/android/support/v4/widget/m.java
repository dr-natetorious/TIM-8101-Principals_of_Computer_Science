public final class android.support.v4.widget.m {
  static final android.support.v4.widget.m$g a;

  static {};
    Code:
       0: invokestatic  #33                 // Method android/support/v4/e/a.a:()Z
       3: ifeq          19
       6: new           #21                 // class android/support/v4/widget/m$f
       9: dup
      10: invokespecial #36                 // Method android/support/v4/widget/m$f."<init>":()V
      13: astore_0
      14: aload_0
      15: putstatic     #38                 // Field a:Landroid/support/v4/widget/m$g;
      18: return
      19: getstatic     #44                 // Field android/os/Build$VERSION.SDK_INT:I
      22: bipush        26
      24: if_icmplt     38
      27: new           #18                 // class android/support/v4/widget/m$e
      30: dup
      31: invokespecial #45                 // Method android/support/v4/widget/m$e."<init>":()V
      34: astore_0
      35: goto          14
      38: getstatic     #44                 // Field android/os/Build$VERSION.SDK_INT:I
      41: bipush        23
      43: if_icmplt     57
      46: new           #15                 // class android/support/v4/widget/m$d
      49: dup
      50: invokespecial #46                 // Method android/support/v4/widget/m$d."<init>":()V
      53: astore_0
      54: goto          14
      57: getstatic     #44                 // Field android/os/Build$VERSION.SDK_INT:I
      60: bipush        18
      62: if_icmplt     76
      65: new           #12                 // class android/support/v4/widget/m$c
      68: dup
      69: invokespecial #47                 // Method android/support/v4/widget/m$c."<init>":()V
      72: astore_0
      73: goto          14
      76: getstatic     #44                 // Field android/os/Build$VERSION.SDK_INT:I
      79: bipush        17
      81: if_icmplt     95
      84: new           #9                  // class android/support/v4/widget/m$b
      87: dup
      88: invokespecial #48                 // Method android/support/v4/widget/m$b."<init>":()V
      91: astore_0
      92: goto          14
      95: getstatic     #44                 // Field android/os/Build$VERSION.SDK_INT:I
      98: bipush        16
     100: if_icmplt     114
     103: new           #6                  // class android/support/v4/widget/m$a
     106: dup
     107: invokespecial #49                 // Method android/support/v4/widget/m$a."<init>":()V
     110: astore_0
     111: goto          14
     114: new           #24                 // class android/support/v4/widget/m$g
     117: dup
     118: invokespecial #50                 // Method android/support/v4/widget/m$g."<init>":()V
     121: astore_0
     122: goto          14

  public static void a(android.widget.TextView, int);
    Code:
       0: getstatic     #38                 // Field a:Landroid/support/v4/widget/m$g;
       3: aload_0
       4: iload_1
       5: invokevirtual #54                 // Method android/support/v4/widget/m$g.a:(Landroid/widget/TextView;I)V
       8: return

  public static void a(android.widget.TextView, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable);
    Code:
       0: getstatic     #38                 // Field a:Landroid/support/v4/widget/m$g;
       3: aload_0
       4: aload_1
       5: aload_2
       6: aload_3
       7: aload         4
       9: invokevirtual #57                 // Method android/support/v4/widget/m$g.a:(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
      12: return
}
