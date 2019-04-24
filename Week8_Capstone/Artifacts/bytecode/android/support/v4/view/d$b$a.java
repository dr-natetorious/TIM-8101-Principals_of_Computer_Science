class android.support.v4.view.d$b$a extends android.os.Handler {
  final android.support.v4.view.d$b a;

  android.support.v4.view.d$b$a(android.support.v4.view.d$b);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field a:Landroid/support/v4/view/d$b;
       5: aload_0
       6: invokespecial #18                 // Method android/os/Handler."<init>":()V
       9: return

  android.support.v4.view.d$b$a(android.support.v4.view.d$b, android.os.Handler);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field a:Landroid/support/v4/view/d$b;
       5: aload_0
       6: aload_2
       7: invokevirtual #24                 // Method android/os/Handler.getLooper:()Landroid/os/Looper;
      10: invokespecial #27                 // Method android/os/Handler."<init>":(Landroid/os/Looper;)V
      13: return

  public void handleMessage(android.os.Message);
    Code:
       0: aload_1
       1: getfield      #35                 // Field android/os/Message.what:I
       4: tableswitch   { // 1 to 3
                     1: 123
                     2: 115
                     3: 65
               default: 32
          }
      32: new           #37                 // class java/lang/StringBuilder
      35: dup
      36: invokespecial #38                 // Method java/lang/StringBuilder."<init>":()V
      39: astore_2
      40: aload_2
      41: ldc           #40                 // String Unknown message
      43: invokevirtual #44                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      46: pop
      47: aload_2
      48: aload_1
      49: invokevirtual #47                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      52: pop
      53: new           #49                 // class java/lang/RuntimeException
      56: dup
      57: aload_2
      58: invokevirtual #53                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      61: invokespecial #56                 // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
      64: athrow
      65: aload_0
      66: getfield      #15                 // Field a:Landroid/support/v4/view/d$b;
      69: getfield      #59                 // Field android/support/v4/view/d$b.b:Landroid/view/GestureDetector$OnDoubleTapListener;
      72: ifnull        142
      75: aload_0
      76: getfield      #15                 // Field a:Landroid/support/v4/view/d$b;
      79: getfield      #63                 // Field android/support/v4/view/d$b.c:Z
      82: ifne          106
      85: aload_0
      86: getfield      #15                 // Field a:Landroid/support/v4/view/d$b;
      89: getfield      #59                 // Field android/support/v4/view/d$b.b:Landroid/view/GestureDetector$OnDoubleTapListener;
      92: aload_0
      93: getfield      #15                 // Field a:Landroid/support/v4/view/d$b;
      96: getfield      #67                 // Field android/support/v4/view/d$b.e:Landroid/view/MotionEvent;
      99: invokeinterface #73,  2           // InterfaceMethod android/view/GestureDetector$OnDoubleTapListener.onSingleTapConfirmed:(Landroid/view/MotionEvent;)Z
     104: pop
     105: return
     106: aload_0
     107: getfield      #15                 // Field a:Landroid/support/v4/view/d$b;
     110: iconst_1
     111: putfield      #76                 // Field android/support/v4/view/d$b.d:Z
     114: return
     115: aload_0
     116: getfield      #15                 // Field a:Landroid/support/v4/view/d$b;
     119: invokevirtual #78                 // Method android/support/v4/view/d$b.a:()V
     122: return
     123: aload_0
     124: getfield      #15                 // Field a:Landroid/support/v4/view/d$b;
     127: getfield      #81                 // Field android/support/v4/view/d$b.a:Landroid/view/GestureDetector$OnGestureListener;
     130: aload_0
     131: getfield      #15                 // Field a:Landroid/support/v4/view/d$b;
     134: getfield      #67                 // Field android/support/v4/view/d$b.e:Landroid/view/MotionEvent;
     137: invokeinterface #87,  2           // InterfaceMethod android/view/GestureDetector$OnGestureListener.onShowPress:(Landroid/view/MotionEvent;)V
     142: return
}
