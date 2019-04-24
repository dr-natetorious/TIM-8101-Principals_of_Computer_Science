public class android.support.v4.widget.h {
  static final android.support.v4.widget.h$b a;

  static {};
    Code:
       0: getstatic     #22                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     21
       8: new           #12                 // class android/support/v4/widget/h$c
      11: dup
      12: invokespecial #25                 // Method android/support/v4/widget/h$c."<init>":()V
      15: astore_0
      16: aload_0
      17: putstatic     #27                 // Field a:Landroid/support/v4/widget/h$b;
      20: return
      21: new           #6                  // class android/support/v4/widget/h$a
      24: dup
      25: invokespecial #28                 // Method android/support/v4/widget/h$a."<init>":()V
      28: astore_0
      29: goto          16

  public static android.content.res.ColorStateList a(android.widget.ImageView);
    Code:
       0: getstatic     #27                 // Field a:Landroid/support/v4/widget/h$b;
       3: aload_0
       4: invokeinterface #32,  2           // InterfaceMethod android/support/v4/widget/h$b.a:(Landroid/widget/ImageView;)Landroid/content/res/ColorStateList;
       9: areturn

  public static void a(android.widget.ImageView, android.content.res.ColorStateList);
    Code:
       0: getstatic     #27                 // Field a:Landroid/support/v4/widget/h$b;
       3: aload_0
       4: aload_1
       5: invokeinterface #35,  3           // InterfaceMethod android/support/v4/widget/h$b.a:(Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V
      10: return

  public static void a(android.widget.ImageView, android.graphics.PorterDuff$Mode);
    Code:
       0: getstatic     #27                 // Field a:Landroid/support/v4/widget/h$b;
       3: aload_0
       4: aload_1
       5: invokeinterface #38,  3           // InterfaceMethod android/support/v4/widget/h$b.a:(Landroid/widget/ImageView;Landroid/graphics/PorterDuff$Mode;)V
      10: return

  public static android.graphics.PorterDuff$Mode b(android.widget.ImageView);
    Code:
       0: getstatic     #27                 // Field a:Landroid/support/v4/widget/h$b;
       3: aload_0
       4: invokeinterface #41,  2           // InterfaceMethod android/support/v4/widget/h$b.b:(Landroid/widget/ImageView;)Landroid/graphics/PorterDuff$Mode;
       9: areturn
}
