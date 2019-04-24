class android.support.v4.view.u$c {
  android.support.v4.view.u$c();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method java/lang/Object."<init>":()V
       4: return

  public boolean a(android.view.ViewGroup);
    Code:
       0: aload_1
       1: getstatic     #20                 // Field android/support/a/a$a.tag_transition_group:I
       4: invokevirtual #26                 // Method android/view/ViewGroup.getTag:(I)Ljava/lang/Object;
       7: checkcast     #28                 // class java/lang/Boolean
      10: astore_2
      11: aload_2
      12: ifnull        22
      15: aload_2
      16: invokevirtual #32                 // Method java/lang/Boolean.booleanValue:()Z
      19: ifne          41
      22: aload_1
      23: invokevirtual #36                 // Method android/view/ViewGroup.getBackground:()Landroid/graphics/drawable/Drawable;
      26: ifnonnull     41
      29: aload_1
      30: invokestatic  #42                 // Method android/support/v4/view/s.m:(Landroid/view/View;)Ljava/lang/String;
      33: ifnull        39
      36: goto          41
      39: iconst_0
      40: ireturn
      41: iconst_1
      42: ireturn
}
