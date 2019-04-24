class android.support.c.a.c$1 implements android.graphics.drawable.Drawable$Callback {
  final android.support.c.a.c a;

  android.support.c.a.c$1(android.support.c.a.c);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/c/a/c;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public void invalidateDrawable(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/c/a/c;
       4: invokevirtual #23                 // Method android/support/c/a/c.invalidateSelf:()V
       7: return

  public void scheduleDrawable(android.graphics.drawable.Drawable, java.lang.Runnable, long);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/c/a/c;
       4: aload_2
       5: lload_3
       6: invokevirtual #29                 // Method android/support/c/a/c.scheduleSelf:(Ljava/lang/Runnable;J)V
       9: return

  public void unscheduleDrawable(android.graphics.drawable.Drawable, java.lang.Runnable);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/c/a/c;
       4: aload_2
       5: invokevirtual #35                 // Method android/support/c/a/c.unscheduleSelf:(Ljava/lang/Runnable;)V
       8: return
}
