class android.support.v4.media.MediaBrowserCompat$ItemReceiver extends android.support.v4.e.c {
  protected void a(int, android.os.Bundle);
    Code:
       0: aload_2
       1: ifnull        13
       4: aload_2
       5: ldc           #6                  // class android/support/v4/media/MediaBrowserCompat
       7: invokevirtual #19                 // Method java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
      10: invokevirtual #25                 // Method android/os/Bundle.setClassLoader:(Ljava/lang/ClassLoader;)V
      13: iload_1
      14: ifne          78
      17: aload_2
      18: ifnull        78
      21: aload_2
      22: ldc           #27                 // String media_item
      24: invokevirtual #31                 // Method android/os/Bundle.containsKey:(Ljava/lang/String;)Z
      27: ifne          33
      30: goto          78
      33: aload_2
      34: ldc           #27                 // String media_item
      36: invokevirtual #35                 // Method android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
      39: astore_2
      40: aload_2
      41: ifnull        66
      44: aload_2
      45: instanceof    #37                 // class android/support/v4/media/MediaBrowserCompat$MediaItem
      48: ifeq          54
      51: goto          66
      54: aload_0
      55: getfield      #39                 // Field e:Landroid/support/v4/media/MediaBrowserCompat$b;
      58: aload_0
      59: getfield      #41                 // Field d:Ljava/lang/String;
      62: invokevirtual #46                 // Method android/support/v4/media/MediaBrowserCompat$b.a:(Ljava/lang/String;)V
      65: return
      66: aload_0
      67: getfield      #39                 // Field e:Landroid/support/v4/media/MediaBrowserCompat$b;
      70: aload_2
      71: checkcast     #37                 // class android/support/v4/media/MediaBrowserCompat$MediaItem
      74: invokevirtual #49                 // Method android/support/v4/media/MediaBrowserCompat$b.a:(Landroid/support/v4/media/MediaBrowserCompat$MediaItem;)V
      77: return
      78: aload_0
      79: getfield      #39                 // Field e:Landroid/support/v4/media/MediaBrowserCompat$b;
      82: aload_0
      83: getfield      #41                 // Field d:Ljava/lang/String;
      86: invokevirtual #46                 // Method android/support/v4/media/MediaBrowserCompat$b.a:(Ljava/lang/String;)V
      89: return
}
