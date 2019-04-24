public abstract class ryey.easer.plugins.event.b<T extends ryey.easer.commons.local_plugin.eventplugin.EventData> implements ryey.easer.commons.local_plugin.eventplugin.c<T> {
  protected final android.content.Context a;

  protected final T b;

  protected java.lang.Boolean c;

  protected final boolean d;

  protected final boolean e;

  protected android.net.Uri f;

  public ryey.easer.plugins.event.b(android.content.Context, T, boolean, boolean);
    Code:
       0: aload_0
       1: invokespecial #24                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #26                 // Field c:Ljava/lang/Boolean;
       9: aload_0
      10: aload_1
      11: putfield      #28                 // Field a:Landroid/content/Context;
      14: aload_0
      15: aload_2
      16: putfield      #30                 // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
      19: aload_0
      20: iload_3
      21: putfield      #32                 // Field d:Z
      24: aload_0
      25: iload         4
      27: putfield      #34                 // Field e:Z
      30: return

  public void a(android.net.Uri);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #40                 // Field f:Landroid/net/Uri;
       5: return

  protected void a(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: aconst_null
       3: invokevirtual #44                 // Method a:(ZLandroid/os/Bundle;)V
       6: return

  protected void a(boolean, android.os.Bundle);
    Code:
       0: aload_0
       1: monitorenter
       2: aload_0
       3: getfield      #26                 // Field c:Ljava/lang/Boolean;
       6: ifnull        79
       9: aload_0
      10: getfield      #34                 // Field e:Z
      13: ifeq          42
      16: aload_0
      17: getfield      #26                 // Field c:Ljava/lang/Boolean;
      20: invokevirtual #50                 // Method java/lang/Boolean.booleanValue:()Z
      23: ifeq          42
      26: iload_1
      27: ifne          42
      30: ldc           #52                 // String prevent from resetting a persistent slot back to unsatisfied
      32: iconst_0
      33: anewarray     #5                  // class java/lang/Object
      36: invokestatic  #57                 // Method com/b/a/i.d:(Ljava/lang/String;[Ljava/lang/Object;)V
      39: aload_0
      40: monitorexit
      41: return
      42: aload_0
      43: getfield      #32                 // Field d:Z
      46: ifne          79
      49: aload_0
      50: getfield      #26                 // Field c:Ljava/lang/Boolean;
      53: invokevirtual #50                 // Method java/lang/Boolean.booleanValue:()Z
      56: iload_1
      57: if_icmpne     79
      60: ldc           #59                 // String satisfied state is already %s
      62: iconst_1
      63: anewarray     #5                  // class java/lang/Object
      66: dup
      67: iconst_0
      68: iload_1
      69: invokestatic  #63                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      72: aastore
      73: invokestatic  #57                 // Method com/b/a/i.d:(Ljava/lang/String;[Ljava/lang/Object;)V
      76: aload_0
      77: monitorexit
      78: return
      79: aload_0
      80: iload_1
      81: invokestatic  #63                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      84: putfield      #26                 // Field c:Ljava/lang/Boolean;
      87: aload_0
      88: getfield      #26                 // Field c:Ljava/lang/Boolean;
      91: invokevirtual #50                 // Method java/lang/Boolean.booleanValue:()Z
      94: ifeq          108
      97: aload_0
      98: getfield      #40                 // Field f:Landroid/net/Uri;
     101: invokestatic  #68                 // Method ryey/easer/core/d$a.a:(Landroid/net/Uri;)Landroid/content/Intent;
     104: astore_3
     105: goto          116
     108: aload_0
     109: getfield      #40                 // Field f:Landroid/net/Uri;
     112: invokestatic  #70                 // Method ryey/easer/core/d$a.b:(Landroid/net/Uri;)Landroid/content/Intent;
     115: astore_3
     116: aload_3
     117: ldc           #72                 // String ryey.easer.core.lotus.extras.DYNAMICS_PROPERTIES
     119: aload_2
     120: invokevirtual #78                 // Method android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
     123: pop
     124: aload_0
     125: getfield      #28                 // Field a:Landroid/content/Context;
     128: aload_3
     129: invokevirtual #84                 // Method android/content/Context.sendBroadcast:(Landroid/content/Intent;)V
     132: ldc           #86                 // String finished changeSatisfiedState to %s
     134: iconst_1
     135: anewarray     #5                  // class java/lang/Object
     138: dup
     139: iconst_0
     140: iload_1
     141: invokestatic  #63                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
     144: aastore
     145: invokestatic  #88                 // Method com/b/a/i.a:(Ljava/lang/String;[Ljava/lang/Object;)V
     148: aload_0
     149: monitorexit
     150: return
     151: astore_2
     152: aload_0
     153: monitorexit
     154: aload_2
     155: athrow
    Exception table:
       from    to  target type
           2    26   151   any
          30    39   151   any
          42    76   151   any
          79   105   151   any
         108   116   151   any
         116   148   151   any
}
