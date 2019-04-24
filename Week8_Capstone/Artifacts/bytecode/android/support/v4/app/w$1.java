class android.support.v4.app.w$1 extends android.transition.Transition$EpicenterCallback {
  final android.graphics.Rect a;

  final android.support.v4.app.w b;

  android.support.v4.app.w$1(android.support.v4.app.w, android.graphics.Rect);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #16                 // Field b:Landroid/support/v4/app/w;
       5: aload_0
       6: aload_2
       7: putfield      #18                 // Field a:Landroid/graphics/Rect;
      10: aload_0
      11: invokespecial #21                 // Method android/transition/Transition$EpicenterCallback."<init>":()V
      14: return

  public android.graphics.Rect onGetEpicenter(android.transition.Transition);
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Landroid/graphics/Rect;
       4: areturn
}
