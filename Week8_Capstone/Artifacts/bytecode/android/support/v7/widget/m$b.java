class android.support.v7.widget.m$b extends android.support.v4.g.g<java.lang.Integer, android.graphics.PorterDuffColorFilter> {
  public android.support.v7.widget.m$b(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #12                 // Method android/support/v4/g/g."<init>":(I)V
       5: return

  android.graphics.PorterDuffColorFilter a(int, android.graphics.PorterDuff$Mode);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: invokestatic  #24                 // Method b:(ILandroid/graphics/PorterDuff$Mode;)I
       6: invokestatic  #30                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       9: invokevirtual #33                 // Method a:(Ljava/lang/Object;)Ljava/lang/Object;
      12: checkcast     #35                 // class android/graphics/PorterDuffColorFilter
      15: areturn

  android.graphics.PorterDuffColorFilter a(int, android.graphics.PorterDuff$Mode, android.graphics.PorterDuffColorFilter);
    Code:
       0: aload_0
       1: iload_1
       2: aload_2
       3: invokestatic  #24                 // Method b:(ILandroid/graphics/PorterDuff$Mode;)I
       6: invokestatic  #30                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       9: aload_3
      10: invokevirtual #39                 // Method a:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      13: checkcast     #35                 // class android/graphics/PorterDuffColorFilter
      16: areturn
}
