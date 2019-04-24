public class android.support.v4.view.a.c {
  public android.support.v4.view.a.c();
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: getstatic     #21                 // Field android/os/Build$VERSION.SDK_INT:I
       7: bipush        19
       9: if_icmplt     27
      12: new           #9                  // class android/support/v4/view/a/c$b
      15: dup
      16: aload_0
      17: invokespecial #24                 // Method android/support/v4/view/a/c$b."<init>":(Landroid/support/v4/view/a/c;)V
      20: astore_1
      21: aload_0
      22: aload_1
      23: putfield      #26                 // Field a:Ljava/lang/Object;
      26: return
      27: getstatic     #21                 // Field android/os/Build$VERSION.SDK_INT:I
      30: bipush        16
      32: if_icmplt     47
      35: new           #6                  // class android/support/v4/view/a/c$a
      38: dup
      39: aload_0
      40: invokespecial #27                 // Method android/support/v4/view/a/c$a."<init>":(Landroid/support/v4/view/a/c;)V
      43: astore_1
      44: goto          21
      47: aconst_null
      48: astore_1
      49: goto          21

  public android.support.v4.view.a.c(java.lang.Object);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #26                 // Field a:Ljava/lang/Object;
       9: return

  public android.support.v4.view.a.b a(int);
    Code:
       0: aconst_null
       1: areturn

  public java.lang.Object a();
    Code:
       0: aload_0
       1: getfield      #26                 // Field a:Ljava/lang/Object;
       4: areturn

  public java.util.List<android.support.v4.view.a.b> a(java.lang.String, int);
    Code:
       0: aconst_null
       1: areturn

  public boolean a(int, int, android.os.Bundle);
    Code:
       0: iconst_0
       1: ireturn

  public android.support.v4.view.a.b b(int);
    Code:
       0: aconst_null
       1: areturn
}
