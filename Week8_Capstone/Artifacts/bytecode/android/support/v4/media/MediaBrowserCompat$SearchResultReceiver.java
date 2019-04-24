class android.support.v4.media.MediaBrowserCompat$SearchResultReceiver extends android.support.v4.e.c {
  protected void a(int, android.os.Bundle);
    Code:
       0: aload_2
       1: ifnull        13
       4: aload_2
       5: ldc           #6                  // class android/support/v4/media/MediaBrowserCompat
       7: invokevirtual #21                 // Method java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
      10: invokevirtual #27                 // Method android/os/Bundle.setClassLoader:(Ljava/lang/ClassLoader;)V
      13: iload_1
      14: ifne          110
      17: aload_2
      18: ifnull        110
      21: aload_2
      22: ldc           #29                 // String search_results
      24: invokevirtual #33                 // Method android/os/Bundle.containsKey:(Ljava/lang/String;)Z
      27: ifne          33
      30: goto          110
      33: aload_2
      34: ldc           #29                 // String search_results
      36: invokevirtual #37                 // Method android/os/Bundle.getParcelableArray:(Ljava/lang/String;)[Landroid/os/Parcelable;
      39: astore        5
      41: aconst_null
      42: astore_2
      43: aload         5
      45: ifnull        93
      48: new           #39                 // class java/util/ArrayList
      51: dup
      52: invokespecial #43                 // Method java/util/ArrayList."<init>":()V
      55: astore        4
      57: aload         5
      59: arraylength
      60: istore_3
      61: iconst_0
      62: istore_1
      63: aload         4
      65: astore_2
      66: iload_1
      67: iload_3
      68: if_icmpge     93
      71: aload         4
      73: aload         5
      75: iload_1
      76: aaload
      77: checkcast     #45                 // class android/support/v4/media/MediaBrowserCompat$MediaItem
      80: invokeinterface #51,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      85: pop
      86: iload_1
      87: iconst_1
      88: iadd
      89: istore_1
      90: goto          63
      93: aload_0
      94: getfield      #53                 // Field f:Landroid/support/v4/media/MediaBrowserCompat$c;
      97: aload_0
      98: getfield      #55                 // Field d:Ljava/lang/String;
     101: aload_0
     102: getfield      #57                 // Field e:Landroid/os/Bundle;
     105: aload_2
     106: invokevirtual #62                 // Method android/support/v4/media/MediaBrowserCompat$c.a:(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;)V
     109: return
     110: aload_0
     111: getfield      #53                 // Field f:Landroid/support/v4/media/MediaBrowserCompat$c;
     114: aload_0
     115: getfield      #55                 // Field d:Ljava/lang/String;
     118: aload_0
     119: getfield      #57                 // Field e:Landroid/os/Bundle;
     122: invokevirtual #65                 // Method android/support/v4/media/MediaBrowserCompat$c.a:(Ljava/lang/String;Landroid/os/Bundle;)V
     125: return
}
