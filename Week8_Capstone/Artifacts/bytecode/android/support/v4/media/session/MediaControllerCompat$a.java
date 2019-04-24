public abstract class android.support.v4.media.session.MediaControllerCompat$a implements android.os.IBinder$DeathRecipient {
  android.support.v4.media.session.MediaControllerCompat$a$a a;

  boolean b;

  public android.support.v4.media.session.MediaControllerCompat$a();
    Code:
       0: aload_0
       1: invokespecial #24                 // Method java/lang/Object."<init>":()V
       4: getstatic     #30                 // Field android/os/Build$VERSION.SDK_INT:I
       7: bipush        21
       9: if_icmplt     30
      12: new           #13                 // class android/support/v4/media/session/MediaControllerCompat$a$b
      15: dup
      16: aload_0
      17: invokespecial #33                 // Method android/support/v4/media/session/MediaControllerCompat$a$b."<init>":(Landroid/support/v4/media/session/MediaControllerCompat$a;)V
      20: invokestatic  #38                 // Method android/support/v4/media/session/c.a:(Landroid/support/v4/media/session/c$a;)Ljava/lang/Object;
      23: astore_1
      24: aload_0
      25: aload_1
      26: putfield      #40                 // Field c:Ljava/lang/Object;
      29: return
      30: new           #16                 // class android/support/v4/media/session/MediaControllerCompat$a$c
      33: dup
      34: aload_0
      35: invokespecial #41                 // Method android/support/v4/media/session/MediaControllerCompat$a$c."<init>":(Landroid/support/v4/media/session/MediaControllerCompat$a;)V
      38: astore_1
      39: goto          24

  public void a();
    Code:
       0: return

  public void a(int);
    Code:
       0: return

  void a(int, java.lang.Object, android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #46                 // Field a:Landroid/support/v4/media/session/MediaControllerCompat$a$a;
       4: ifnull        26
       7: aload_0
       8: getfield      #46                 // Field a:Landroid/support/v4/media/session/MediaControllerCompat$a$a;
      11: iload_1
      12: aload_2
      13: invokevirtual #50                 // Method android/support/v4/media/session/MediaControllerCompat$a$a.obtainMessage:(ILjava/lang/Object;)Landroid/os/Message;
      16: astore_2
      17: aload_2
      18: aload_3
      19: invokevirtual #56                 // Method android/os/Message.setData:(Landroid/os/Bundle;)V
      22: aload_2
      23: invokevirtual #59                 // Method android/os/Message.sendToTarget:()V
      26: return

  public void a(android.os.Bundle);
    Code:
       0: return

  public void a(android.support.v4.media.MediaMetadataCompat);
    Code:
       0: return

  public void a(android.support.v4.media.session.MediaControllerCompat$b);
    Code:
       0: return

  public void a(android.support.v4.media.session.PlaybackStateCompat);
    Code:
       0: return

  public void a(java.lang.CharSequence);
    Code:
       0: return

  public void a(java.lang.String, android.os.Bundle);
    Code:
       0: return

  public void a(java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem>);
    Code:
       0: return

  public void a(boolean);
    Code:
       0: return

  public void b();
    Code:
       0: return

  public void b(int);
    Code:
       0: return
}
