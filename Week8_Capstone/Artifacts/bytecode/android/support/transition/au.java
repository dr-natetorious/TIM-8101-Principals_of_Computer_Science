class android.support.transition.au implements android.support.transition.aw {
  android.support.transition.au(android.os.IBinder);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #15                 // Field a:Landroid/os/IBinder;
       9: return

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class android/support/transition/au
       4: ifeq          26
       7: aload_1
       8: checkcast     #2                  // class android/support/transition/au
      11: getfield      #15                 // Field a:Landroid/os/IBinder;
      14: aload_0
      15: getfield      #15                 // Field a:Landroid/os/IBinder;
      18: invokevirtual #20                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      21: ifeq          26
      24: iconst_1
      25: ireturn
      26: iconst_0
      27: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/os/IBinder;
       4: invokevirtual #24                 // Method java/lang/Object.hashCode:()I
       7: ireturn
}
