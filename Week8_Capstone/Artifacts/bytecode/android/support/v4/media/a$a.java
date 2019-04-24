class android.support.v4.media.a$a {
  public static java.lang.Object a();
    Code:
       0: new           #10                 // class android/media/MediaDescription$Builder
       3: dup
       4: invokespecial #14                 // Method android/media/MediaDescription$Builder."<init>":()V
       7: areturn

  public static java.lang.Object a(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/MediaDescription$Builder
       4: invokevirtual #20                 // Method android/media/MediaDescription$Builder.build:()Landroid/media/MediaDescription;
       7: areturn

  public static void a(java.lang.Object, android.graphics.Bitmap);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/MediaDescription$Builder
       4: aload_1
       5: invokevirtual #25                 // Method android/media/MediaDescription$Builder.setIconBitmap:(Landroid/graphics/Bitmap;)Landroid/media/MediaDescription$Builder;
       8: pop
       9: return

  public static void a(java.lang.Object, android.net.Uri);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/MediaDescription$Builder
       4: aload_1
       5: invokevirtual #30                 // Method android/media/MediaDescription$Builder.setIconUri:(Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;
       8: pop
       9: return

  public static void a(java.lang.Object, android.os.Bundle);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/MediaDescription$Builder
       4: aload_1
       5: invokevirtual #35                 // Method android/media/MediaDescription$Builder.setExtras:(Landroid/os/Bundle;)Landroid/media/MediaDescription$Builder;
       8: pop
       9: return

  public static void a(java.lang.Object, java.lang.CharSequence);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/MediaDescription$Builder
       4: aload_1
       5: invokevirtual #40                 // Method android/media/MediaDescription$Builder.setTitle:(Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;
       8: pop
       9: return

  public static void a(java.lang.Object, java.lang.String);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/MediaDescription$Builder
       4: aload_1
       5: invokevirtual #45                 // Method android/media/MediaDescription$Builder.setMediaId:(Ljava/lang/String;)Landroid/media/MediaDescription$Builder;
       8: pop
       9: return

  public static void b(java.lang.Object, java.lang.CharSequence);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/MediaDescription$Builder
       4: aload_1
       5: invokevirtual #49                 // Method android/media/MediaDescription$Builder.setSubtitle:(Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;
       8: pop
       9: return

  public static void c(java.lang.Object, java.lang.CharSequence);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/MediaDescription$Builder
       4: aload_1
       5: invokevirtual #53                 // Method android/media/MediaDescription$Builder.setDescription:(Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;
       8: pop
       9: return
}
