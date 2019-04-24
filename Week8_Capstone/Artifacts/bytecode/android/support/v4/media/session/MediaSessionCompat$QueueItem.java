public final class android.support.v4.media.session.MediaSessionCompat$QueueItem implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$QueueItem> CREATOR;

  static {};
    Code:
       0: new           #11                 // class android/support/v4/media/session/MediaSessionCompat$QueueItem$1
       3: dup
       4: invokespecial #25                 // Method android/support/v4/media/session/MediaSessionCompat$QueueItem$1."<init>":()V
       7: putstatic     #27                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  android.support.v4.media.session.MediaSessionCompat$QueueItem(android.os.Parcel);
    Code:
       0: aload_0
       1: invokespecial #30                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: getstatic     #33                 // Field android/support/v4/media/MediaDescriptionCompat.CREATOR:Landroid/os/Parcelable$Creator;
       8: aload_1
       9: invokeinterface #39,  2           // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
      14: checkcast     #32                 // class android/support/v4/media/MediaDescriptionCompat
      17: putfield      #41                 // Field a:Landroid/support/v4/media/MediaDescriptionCompat;
      20: aload_0
      21: aload_1
      22: invokevirtual #47                 // Method android/os/Parcel.readLong:()J
      25: putfield      #49                 // Field b:J
      28: return

  public static android.support.v4.media.session.MediaSessionCompat$QueueItem a(java.lang.Object);
    Code:
       0: aload_0
       1: ifnull        35
       4: getstatic     #70                 // Field android/os/Build$VERSION.SDK_INT:I
       7: bipush        21
       9: if_icmpge     15
      12: goto          35
      15: new           #2                  // class android/support/v4/media/session/MediaSessionCompat$QueueItem
      18: dup
      19: aload_0
      20: aload_0
      21: invokestatic  #75                 // Method android/support/v4/media/session/d$a.a:(Ljava/lang/Object;)Ljava/lang/Object;
      24: invokestatic  #78                 // Method android/support/v4/media/MediaDescriptionCompat.a:(Ljava/lang/Object;)Landroid/support/v4/media/MediaDescriptionCompat;
      27: aload_0
      28: invokestatic  #81                 // Method android/support/v4/media/session/d$a.b:(Ljava/lang/Object;)J
      31: invokespecial #83                 // Method "<init>":(Ljava/lang/Object;Landroid/support/v4/media/MediaDescriptionCompat;J)V
      34: areturn
      35: aconst_null
      36: areturn

  public static java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> a(java.util.List<?>);
    Code:
       0: aload_0
       1: ifnull        60
       4: getstatic     #70                 // Field android/os/Build$VERSION.SDK_INT:I
       7: bipush        21
       9: if_icmpge     15
      12: goto          60
      15: new           #86                 // class java/util/ArrayList
      18: dup
      19: invokespecial #87                 // Method java/util/ArrayList."<init>":()V
      22: astore_1
      23: aload_0
      24: invokeinterface #93,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      29: astore_0
      30: aload_0
      31: invokeinterface #99,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      36: ifeq          58
      39: aload_1
      40: aload_0
      41: invokeinterface #103,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      46: invokestatic  #105                // Method a:(Ljava/lang/Object;)Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;
      49: invokeinterface #109,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      54: pop
      55: goto          30
      58: aload_1
      59: areturn
      60: aconst_null
      61: areturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public java.lang.String toString();
    Code:
       0: new           #117                // class java/lang/StringBuilder
       3: dup
       4: invokespecial #118                // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #120                // String MediaSession.QueueItem {Description=
      11: invokevirtual #124                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #41                 // Field a:Landroid/support/v4/media/MediaDescriptionCompat;
      20: invokevirtual #127                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #129                // String , Id=
      27: invokevirtual #124                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: aload_0
      33: getfield      #49                 // Field b:J
      36: invokevirtual #132                // Method java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
      39: pop
      40: aload_1
      41: ldc           #134                // String  }
      43: invokevirtual #124                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      46: pop
      47: aload_1
      48: invokevirtual #136                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      51: areturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_0
       1: getfield      #41                 // Field a:Landroid/support/v4/media/MediaDescriptionCompat;
       4: aload_1
       5: iload_2
       6: invokevirtual #140                // Method android/support/v4/media/MediaDescriptionCompat.writeToParcel:(Landroid/os/Parcel;I)V
       9: aload_1
      10: aload_0
      11: getfield      #49                 // Field b:J
      14: invokevirtual #144                // Method android/os/Parcel.writeLong:(J)V
      17: return
}
