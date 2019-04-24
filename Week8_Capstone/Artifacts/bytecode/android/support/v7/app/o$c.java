class android.support.v7.app.o$c extends android.support.v7.view.i {
  final android.support.v7.app.o a;

  public android.support.v7.app.o$c(android.support.v7.app.o, android.view.Window$Callback);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #13                 // Field a:Landroid/support/v7/app/o;
       5: aload_0
       6: aload_2
       7: invokespecial #16                 // Method android/support/v7/view/i."<init>":(Landroid/view/Window$Callback;)V
      10: return

  public android.view.View onCreatePanelView(int);
    Code:
       0: iload_1
       1: ifne          24
       4: new           #21                 // class android/view/View
       7: dup
       8: aload_0
       9: getfield      #13                 // Field a:Landroid/support/v7/app/o;
      12: getfield      #24                 // Field android/support/v7/app/o.a:Landroid/support/v7/widget/al;
      15: invokeinterface #30,  1           // InterfaceMethod android/support/v7/widget/al.b:()Landroid/content/Context;
      20: invokespecial #33                 // Method android/view/View."<init>":(Landroid/content/Context;)V
      23: areturn
      24: aload_0
      25: iload_1
      26: invokespecial #35                 // Method android/support/v7/view/i.onCreatePanelView:(I)Landroid/view/View;
      29: areturn

  public boolean onPreparePanel(int, android.view.View, android.view.Menu);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: aload_3
       4: invokespecial #39                 // Method android/support/v7/view/i.onPreparePanel:(ILandroid/view/View;Landroid/view/Menu;)Z
       7: istore        4
       9: iload         4
      11: ifeq          44
      14: aload_0
      15: getfield      #13                 // Field a:Landroid/support/v7/app/o;
      18: getfield      #42                 // Field android/support/v7/app/o.b:Z
      21: ifne          44
      24: aload_0
      25: getfield      #13                 // Field a:Landroid/support/v7/app/o;
      28: getfield      #24                 // Field android/support/v7/app/o.a:Landroid/support/v7/widget/al;
      31: invokeinterface #46,  1           // InterfaceMethod android/support/v7/widget/al.m:()V
      36: aload_0
      37: getfield      #13                 // Field a:Landroid/support/v7/app/o;
      40: iconst_1
      41: putfield      #42                 // Field android/support/v7/app/o.b:Z
      44: iload         4
      46: ireturn
}
