class android.support.transition.ak implements android.support.transition.al {
  android.support.transition.ak(android.view.View);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokevirtual #19                 // Method android/view/View.getOverlay:()Landroid/view/ViewOverlay;
       9: putfield      #21                 // Field a:Landroid/view/ViewOverlay;
      12: return

  public void a(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/view/ViewOverlay;
       4: aload_1
       5: invokevirtual #28                 // Method android/view/ViewOverlay.add:(Landroid/graphics/drawable/Drawable;)V
       8: return

  public void b(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/view/ViewOverlay;
       4: aload_1
       5: invokevirtual #32                 // Method android/view/ViewOverlay.remove:(Landroid/graphics/drawable/Drawable;)V
       8: return
}
