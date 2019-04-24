public final class android.support.v4.widget.c {
  static {};
    Code:
       0: getstatic     #22                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        23
       5: if_icmplt     21
       8: new           #9                  // class android/support/v4/widget/c$b
      11: dup
      12: invokespecial #25                 // Method android/support/v4/widget/c$b."<init>":()V
      15: astore_0
      16: aload_0
      17: putstatic     #27                 // Field a:Landroid/support/v4/widget/c$c;
      20: return
      21: getstatic     #22                 // Field android/os/Build$VERSION.SDK_INT:I
      24: bipush        21
      26: if_icmplt     40
      29: new           #6                  // class android/support/v4/widget/c$a
      32: dup
      33: invokespecial #28                 // Method android/support/v4/widget/c$a."<init>":()V
      36: astore_0
      37: goto          16
      40: new           #12                 // class android/support/v4/widget/c$c
      43: dup
      44: invokespecial #29                 // Method android/support/v4/widget/c$c."<init>":()V
      47: astore_0
      48: goto          16

  public static android.graphics.drawable.Drawable a(android.widget.CompoundButton);
    Code:
       0: getstatic     #27                 // Field a:Landroid/support/v4/widget/c$c;
       3: aload_0
       4: invokevirtual #33                 // Method android/support/v4/widget/c$c.a:(Landroid/widget/CompoundButton;)Landroid/graphics/drawable/Drawable;
       7: areturn

  public static void a(android.widget.CompoundButton, android.content.res.ColorStateList);
    Code:
       0: getstatic     #27                 // Field a:Landroid/support/v4/widget/c$c;
       3: aload_0
       4: aload_1
       5: invokevirtual #36                 // Method android/support/v4/widget/c$c.a:(Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V
       8: return

  public static void a(android.widget.CompoundButton, android.graphics.PorterDuff$Mode);
    Code:
       0: getstatic     #27                 // Field a:Landroid/support/v4/widget/c$c;
       3: aload_0
       4: aload_1
       5: invokevirtual #39                 // Method android/support/v4/widget/c$c.a:(Landroid/widget/CompoundButton;Landroid/graphics/PorterDuff$Mode;)V
       8: return
}
