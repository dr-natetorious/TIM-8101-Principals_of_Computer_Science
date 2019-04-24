public final class android.support.v4.widget.g {
  static {};
    Code:
       0: getstatic     #19                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     21
       8: new           #6                  // class android/support/v4/widget/g$a
      11: dup
      12: invokespecial #22                 // Method android/support/v4/widget/g$a."<init>":()V
      15: astore_0
      16: aload_0
      17: putstatic     #24                 // Field a:Landroid/support/v4/widget/g$b;
      20: return
      21: new           #9                  // class android/support/v4/widget/g$b
      24: dup
      25: invokespecial #25                 // Method android/support/v4/widget/g$b."<init>":()V
      28: astore_0
      29: goto          16

  public static void a(android.widget.EdgeEffect, float, float);
    Code:
       0: getstatic     #24                 // Field a:Landroid/support/v4/widget/g$b;
       3: aload_0
       4: fload_1
       5: fload_2
       6: invokevirtual #29                 // Method android/support/v4/widget/g$b.a:(Landroid/widget/EdgeEffect;FF)V
       9: return
}
