final class android.support.v7.widget.SwitchCompat$1 extends android.util.Property<android.support.v7.widget.SwitchCompat, java.lang.Float> {
  android.support.v7.widget.SwitchCompat$1(java.lang.Class, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #11                 // Method android/util/Property."<init>":(Ljava/lang/Class;Ljava/lang/String;)V
       6: return

  public java.lang.Float a(android.support.v7.widget.SwitchCompat);
    Code:
       0: aload_1
       1: invokestatic  #17                 // Method android/support/v7/widget/SwitchCompat.a:(Landroid/support/v7/widget/SwitchCompat;)F
       4: invokestatic  #23                 // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
       7: areturn

  public void a(android.support.v7.widget.SwitchCompat, java.lang.Float);
    Code:
       0: aload_1
       1: aload_2
       2: invokevirtual #28                 // Method java/lang/Float.floatValue:()F
       5: invokevirtual #32                 // Method android/support/v7/widget/SwitchCompat.setThumbPosition:(F)V
       8: return

  public java.lang.Object get(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #7                  // class android/support/v7/widget/SwitchCompat
       5: invokevirtual #36                 // Method a:(Landroid/support/v7/widget/SwitchCompat;)Ljava/lang/Float;
       8: areturn

  public void set(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #7                  // class android/support/v7/widget/SwitchCompat
       5: aload_2
       6: checkcast     #19                 // class java/lang/Float
       9: invokevirtual #40                 // Method a:(Landroid/support/v7/widget/SwitchCompat;Ljava/lang/Float;)V
      12: return
}
