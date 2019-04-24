class android.support.v4.app.a$e$1 implements android.support.v4.app.ah$a {
  final android.app.SharedElementCallback$OnSharedElementsReadyListener a;

  final android.support.v4.app.a$e b;

  android.support.v4.app.a$e$1(android.support.v4.app.a$e, android.app.SharedElementCallback$OnSharedElementsReadyListener);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #22                 // Field b:Landroid/support/v4/app/a$e;
       5: aload_0
       6: aload_2
       7: putfield      #24                 // Field a:Landroid/app/SharedElementCallback$OnSharedElementsReadyListener;
      10: aload_0
      11: invokespecial #27                 // Method java/lang/Object."<init>":()V
      14: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Landroid/app/SharedElementCallback$OnSharedElementsReadyListener;
       4: invokeinterface #33,  1           // InterfaceMethod android/app/SharedElementCallback$OnSharedElementsReadyListener.onSharedElementsReady:()V
       9: return
}
