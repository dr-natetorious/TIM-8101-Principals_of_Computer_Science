class android.support.v4.media.session.MediaControllerCompat$a$a extends android.os.Handler {
  boolean a;

  final android.support.v4.media.session.MediaControllerCompat$a b;

  public void handleMessage(android.os.Message);
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Z
       4: ifne          8
       7: return
       8: aload_1
       9: getfield      #22                 // Field android/os/Message.what:I
      12: tableswitch   { // 1 to 13
                     1: 241
                     2: 226
                     3: 211
                     4: 196
                     5: 181
                     6: 166
                     7: 151
                     8: 143
                     9: 125
                    10: 80
                    11: 107
                    12: 89
                    13: 81
               default: 80
          }
      80: return
      81: aload_0
      82: getfield      #24                 // Field b:Landroid/support/v4/media/session/MediaControllerCompat$a;
      85: invokevirtual #27                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:()V
      88: return
      89: aload_0
      90: getfield      #24                 // Field b:Landroid/support/v4/media/session/MediaControllerCompat$a;
      93: aload_1
      94: getfield      #31                 // Field android/os/Message.obj:Ljava/lang/Object;
      97: checkcast     #33                 // class java/lang/Integer
     100: invokevirtual #37                 // Method java/lang/Integer.intValue:()I
     103: invokevirtual #40                 // Method android/support/v4/media/session/MediaControllerCompat$a.b:(I)V
     106: return
     107: aload_0
     108: getfield      #24                 // Field b:Landroid/support/v4/media/session/MediaControllerCompat$a;
     111: aload_1
     112: getfield      #31                 // Field android/os/Message.obj:Ljava/lang/Object;
     115: checkcast     #42                 // class java/lang/Boolean
     118: invokevirtual #46                 // Method java/lang/Boolean.booleanValue:()Z
     121: invokevirtual #49                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(Z)V
     124: return
     125: aload_0
     126: getfield      #24                 // Field b:Landroid/support/v4/media/session/MediaControllerCompat$a;
     129: aload_1
     130: getfield      #31                 // Field android/os/Message.obj:Ljava/lang/Object;
     133: checkcast     #33                 // class java/lang/Integer
     136: invokevirtual #37                 // Method java/lang/Integer.intValue:()I
     139: invokevirtual #51                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(I)V
     142: return
     143: aload_0
     144: getfield      #24                 // Field b:Landroid/support/v4/media/session/MediaControllerCompat$a;
     147: invokevirtual #53                 // Method android/support/v4/media/session/MediaControllerCompat$a.b:()V
     150: return
     151: aload_0
     152: getfield      #24                 // Field b:Landroid/support/v4/media/session/MediaControllerCompat$a;
     155: aload_1
     156: getfield      #31                 // Field android/os/Message.obj:Ljava/lang/Object;
     159: checkcast     #55                 // class android/os/Bundle
     162: invokevirtual #58                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(Landroid/os/Bundle;)V
     165: return
     166: aload_0
     167: getfield      #24                 // Field b:Landroid/support/v4/media/session/MediaControllerCompat$a;
     170: aload_1
     171: getfield      #31                 // Field android/os/Message.obj:Ljava/lang/Object;
     174: checkcast     #60                 // class java/lang/CharSequence
     177: invokevirtual #63                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(Ljava/lang/CharSequence;)V
     180: return
     181: aload_0
     182: getfield      #24                 // Field b:Landroid/support/v4/media/session/MediaControllerCompat$a;
     185: aload_1
     186: getfield      #31                 // Field android/os/Message.obj:Ljava/lang/Object;
     189: checkcast     #65                 // class java/util/List
     192: invokevirtual #68                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(Ljava/util/List;)V
     195: return
     196: aload_0
     197: getfield      #24                 // Field b:Landroid/support/v4/media/session/MediaControllerCompat$a;
     200: aload_1
     201: getfield      #31                 // Field android/os/Message.obj:Ljava/lang/Object;
     204: checkcast     #70                 // class android/support/v4/media/session/MediaControllerCompat$b
     207: invokevirtual #73                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(Landroid/support/v4/media/session/MediaControllerCompat$b;)V
     210: return
     211: aload_0
     212: getfield      #24                 // Field b:Landroid/support/v4/media/session/MediaControllerCompat$a;
     215: aload_1
     216: getfield      #31                 // Field android/os/Message.obj:Ljava/lang/Object;
     219: checkcast     #75                 // class android/support/v4/media/MediaMetadataCompat
     222: invokevirtual #78                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(Landroid/support/v4/media/MediaMetadataCompat;)V
     225: return
     226: aload_0
     227: getfield      #24                 // Field b:Landroid/support/v4/media/session/MediaControllerCompat$a;
     230: aload_1
     231: getfield      #31                 // Field android/os/Message.obj:Ljava/lang/Object;
     234: checkcast     #80                 // class android/support/v4/media/session/PlaybackStateCompat
     237: invokevirtual #83                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(Landroid/support/v4/media/session/PlaybackStateCompat;)V
     240: return
     241: aload_0
     242: getfield      #24                 // Field b:Landroid/support/v4/media/session/MediaControllerCompat$a;
     245: aload_1
     246: getfield      #31                 // Field android/os/Message.obj:Ljava/lang/Object;
     249: checkcast     #85                 // class java/lang/String
     252: aload_1
     253: invokevirtual #89                 // Method android/os/Message.getData:()Landroid/os/Bundle;
     256: invokevirtual #92                 // Method android/support/v4/media/session/MediaControllerCompat$a.a:(Ljava/lang/String;Landroid/os/Bundle;)V
     259: return
}
