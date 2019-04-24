public final class android.support.v4.view.u {
  static final android.support.v4.view.u$c a;

  static {};
    Code:
       0: getstatic     #22                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmplt     21
       8: new           #9                  // class android/support/v4/view/u$b
      11: dup
      12: invokespecial #25                 // Method android/support/v4/view/u$b."<init>":()V
      15: astore_0
      16: aload_0
      17: putstatic     #27                 // Field a:Landroid/support/v4/view/u$c;
      20: return
      21: getstatic     #22                 // Field android/os/Build$VERSION.SDK_INT:I
      24: bipush        18
      26: if_icmplt     40
      29: new           #6                  // class android/support/v4/view/u$a
      32: dup
      33: invokespecial #28                 // Method android/support/v4/view/u$a."<init>":()V
      36: astore_0
      37: goto          16
      40: new           #12                 // class android/support/v4/view/u$c
      43: dup
      44: invokespecial #29                 // Method android/support/v4/view/u$c."<init>":()V
      47: astore_0
      48: goto          16

  public static boolean a(android.view.ViewGroup);
    Code:
       0: getstatic     #27                 // Field a:Landroid/support/v4/view/u$c;
       3: aload_0
       4: invokevirtual #33                 // Method android/support/v4/view/u$c.a:(Landroid/view/ViewGroup;)Z
       7: ireturn
}
