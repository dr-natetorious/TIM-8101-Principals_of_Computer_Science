class android.support.v4.app.i$2 extends android.support.v4.app.k {
  final android.support.v4.app.i a;

  android.support.v4.app.i$2(android.support.v4.app.i);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field a:Landroid/support/v4/app/i;
       5: aload_0
       6: invokespecial #17                 // Method android/support/v4/app/k."<init>":()V
       9: return

  public android.support.v4.app.i a(android.content.Context, java.lang.String, android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/v4/app/i;
       4: getfield      #23                 // Field android/support/v4/app/i.mHost:Landroid/support/v4/app/m;
       7: aload_1
       8: aload_2
       9: aload_3
      10: invokevirtual #27                 // Method android/support/v4/app/m.a:(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/i;
      13: areturn

  public android.view.View a(int);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/v4/app/i;
       4: getfield      #32                 // Field android/support/v4/app/i.mView:Landroid/view/View;
       7: ifnonnull     20
      10: new           #34                 // class java/lang/IllegalStateException
      13: dup
      14: ldc           #36                 // String Fragment does not have a view
      16: invokespecial #39                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      19: athrow
      20: aload_0
      21: getfield      #15                 // Field a:Landroid/support/v4/app/i;
      24: getfield      #32                 // Field android/support/v4/app/i.mView:Landroid/view/View;
      27: iload_1
      28: invokevirtual #44                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      31: areturn

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/v4/app/i;
       4: getfield      #32                 // Field android/support/v4/app/i.mView:Landroid/view/View;
       7: ifnull        12
      10: iconst_1
      11: ireturn
      12: iconst_0
      13: ireturn
}
