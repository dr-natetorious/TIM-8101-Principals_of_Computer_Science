class android.support.transition.av implements android.support.transition.aw {
  android.support.transition.av(android.view.View);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokevirtual #19                 // Method android/view/View.getWindowId:()Landroid/view/WindowId;
       9: putfield      #21                 // Field a:Landroid/view/WindowId;
      12: return

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class android/support/transition/av
       4: ifeq          26
       7: aload_1
       8: checkcast     #2                  // class android/support/transition/av
      11: getfield      #21                 // Field a:Landroid/view/WindowId;
      14: aload_0
      15: getfield      #21                 // Field a:Landroid/view/WindowId;
      18: invokevirtual #28                 // Method android/view/WindowId.equals:(Ljava/lang/Object;)Z
      21: ifeq          26
      24: iconst_1
      25: ireturn
      26: iconst_0
      27: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/view/WindowId;
       4: invokevirtual #32                 // Method android/view/WindowId.hashCode:()I
       7: ireturn
}
