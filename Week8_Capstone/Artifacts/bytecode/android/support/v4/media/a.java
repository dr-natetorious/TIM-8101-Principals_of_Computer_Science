class android.support.v4.media.a {
  public static java.lang.Object a(android.os.Parcel);
    Code:
       0: getstatic     #14                 // Field android/media/MediaDescription.CREATOR:Landroid/os/Parcelable$Creator;
       3: aload_0
       4: invokeinterface #19,  2           // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
       9: areturn

  public static java.lang.String a(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/MediaDescription
       4: invokevirtual #25                 // Method android/media/MediaDescription.getMediaId:()Ljava/lang/String;
       7: areturn

  public static void a(java.lang.Object, android.os.Parcel, int);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/MediaDescription
       4: aload_1
       5: iload_2
       6: invokevirtual #30                 // Method android/media/MediaDescription.writeToParcel:(Landroid/os/Parcel;I)V
       9: return

  public static java.lang.CharSequence b(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/MediaDescription
       4: invokevirtual #36                 // Method android/media/MediaDescription.getTitle:()Ljava/lang/CharSequence;
       7: areturn

  public static java.lang.CharSequence c(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/MediaDescription
       4: invokevirtual #40                 // Method android/media/MediaDescription.getSubtitle:()Ljava/lang/CharSequence;
       7: areturn

  public static java.lang.CharSequence d(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/MediaDescription
       4: invokevirtual #44                 // Method android/media/MediaDescription.getDescription:()Ljava/lang/CharSequence;
       7: areturn

  public static android.graphics.Bitmap e(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/MediaDescription
       4: invokevirtual #50                 // Method android/media/MediaDescription.getIconBitmap:()Landroid/graphics/Bitmap;
       7: areturn

  public static android.net.Uri f(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/MediaDescription
       4: invokevirtual #56                 // Method android/media/MediaDescription.getIconUri:()Landroid/net/Uri;
       7: areturn

  public static android.os.Bundle g(java.lang.Object);
    Code:
       0: aload_0
       1: checkcast     #10                 // class android/media/MediaDescription
       4: invokevirtual #62                 // Method android/media/MediaDescription.getExtras:()Landroid/os/Bundle;
       7: areturn
}
