class android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver extends android.support.v4.e.c {
  protected void a(int, android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #17                 // Field f:Landroid/support/v4/media/MediaBrowserCompat$a;
       4: ifnonnull     8
       7: return
       8: iload_1
       9: tableswitch   { // -1 to 1
                    -1: 138
                     0: 121
                     1: 104
               default: 36
          }
      36: new           #19                 // class java/lang/StringBuilder
      39: dup
      40: invokespecial #23                 // Method java/lang/StringBuilder."<init>":()V
      43: astore_3
      44: aload_3
      45: ldc           #25                 // String Unknown result code:
      47: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      50: pop
      51: aload_3
      52: iload_1
      53: invokevirtual #32                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      56: pop
      57: aload_3
      58: ldc           #34                 // String  (extras=
      60: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      63: pop
      64: aload_3
      65: aload_0
      66: getfield      #36                 // Field e:Landroid/os/Bundle;
      69: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      72: pop
      73: aload_3
      74: ldc           #41                 // String , resultData=
      76: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      79: pop
      80: aload_3
      81: aload_2
      82: invokevirtual #39                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      85: pop
      86: aload_3
      87: ldc           #43                 // String )
      89: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      92: pop
      93: ldc           #45                 // String MediaBrowserCompat
      95: aload_3
      96: invokevirtual #49                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      99: invokestatic  #55                 // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
     102: pop
     103: return
     104: aload_0
     105: getfield      #17                 // Field f:Landroid/support/v4/media/MediaBrowserCompat$a;
     108: aload_0
     109: getfield      #57                 // Field d:Ljava/lang/String;
     112: aload_0
     113: getfield      #36                 // Field e:Landroid/os/Bundle;
     116: aload_2
     117: invokevirtual #62                 // Method android/support/v4/media/MediaBrowserCompat$a.a:(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V
     120: return
     121: aload_0
     122: getfield      #17                 // Field f:Landroid/support/v4/media/MediaBrowserCompat$a;
     125: aload_0
     126: getfield      #57                 // Field d:Ljava/lang/String;
     129: aload_0
     130: getfield      #36                 // Field e:Landroid/os/Bundle;
     133: aload_2
     134: invokevirtual #65                 // Method android/support/v4/media/MediaBrowserCompat$a.b:(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V
     137: return
     138: aload_0
     139: getfield      #17                 // Field f:Landroid/support/v4/media/MediaBrowserCompat$a;
     142: aload_0
     143: getfield      #57                 // Field d:Ljava/lang/String;
     146: aload_0
     147: getfield      #36                 // Field e:Landroid/os/Bundle;
     150: aload_2
     151: invokevirtual #68                 // Method android/support/v4/media/MediaBrowserCompat$a.c:(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V
     154: return
}
