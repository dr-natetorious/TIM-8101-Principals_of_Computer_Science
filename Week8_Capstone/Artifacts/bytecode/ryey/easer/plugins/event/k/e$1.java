class ryey.easer.plugins.event.k.e$1 extends android.content.BroadcastReceiver {
  final ryey.easer.plugins.event.k.e a;

  ryey.easer.plugins.event.k.e$1(ryey.easer.plugins.event.k.e);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Lryey/easer/plugins/event/k/e;
       5: aload_0
       6: invokespecial #15                 // Method android/content/BroadcastReceiver."<init>":()V
       9: return

  public void onReceive(android.content.Context, android.content.Intent);
    Code:
       0: ldc           #20                 // String android.intent.action.SCREEN_ON
       2: aload_2
       3: invokevirtual #26                 // Method android/content/Intent.getAction:()Ljava/lang/String;
       6: invokevirtual #32                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
       9: istore        6
      11: iconst_0
      12: istore        4
      14: iconst_0
      15: istore        5
      17: iconst_0
      18: istore_3
      19: iload         6
      21: ifeq          56
      24: aload_0
      25: getfield      #12                 // Field a:Lryey/easer/plugins/event/k/e;
      28: astore_1
      29: aload_0
      30: getfield      #12                 // Field a:Lryey/easer/plugins/event/k/e;
      33: invokestatic  #35                 // Method ryey/easer/plugins/event/k/e.a:(Lryey/easer/plugins/event/k/e;)Lryey/easer/commons/local_plugin/eventplugin/EventData;
      36: checkcast     #37                 // class ryey/easer/plugins/event/k/a
      39: getfield      #40                 // Field ryey/easer/plugins/event/k/a.a:Lryey/easer/plugins/event/k/a$a;
      42: getstatic     #43                 // Field ryey/easer/plugins/event/k/a$a.a:Lryey/easer/plugins/event/k/a$a;
      45: if_acmpne     50
      48: iconst_1
      49: istore_3
      50: aload_1
      51: iload_3
      52: invokestatic  #46                 // Method ryey/easer/plugins/event/k/e.a:(Lryey/easer/plugins/event/k/e;Z)V
      55: return
      56: ldc           #48                 // String android.intent.action.SCREEN_OFF
      58: aload_2
      59: invokevirtual #26                 // Method android/content/Intent.getAction:()Ljava/lang/String;
      62: invokevirtual #32                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      65: ifeq          103
      68: aload_0
      69: getfield      #12                 // Field a:Lryey/easer/plugins/event/k/e;
      72: astore_1
      73: iload         4
      75: istore_3
      76: aload_0
      77: getfield      #12                 // Field a:Lryey/easer/plugins/event/k/e;
      80: invokestatic  #51                 // Method ryey/easer/plugins/event/k/e.b:(Lryey/easer/plugins/event/k/e;)Lryey/easer/commons/local_plugin/eventplugin/EventData;
      83: checkcast     #37                 // class ryey/easer/plugins/event/k/a
      86: getfield      #40                 // Field ryey/easer/plugins/event/k/a.a:Lryey/easer/plugins/event/k/a$a;
      89: getstatic     #53                 // Field ryey/easer/plugins/event/k/a$a.b:Lryey/easer/plugins/event/k/a$a;
      92: if_acmpne     97
      95: iconst_1
      96: istore_3
      97: aload_1
      98: iload_3
      99: invokestatic  #55                 // Method ryey/easer/plugins/event/k/e.b:(Lryey/easer/plugins/event/k/e;Z)V
     102: return
     103: ldc           #57                 // String android.intent.action.USER_PRESENT
     105: aload_2
     106: invokevirtual #26                 // Method android/content/Intent.getAction:()Ljava/lang/String;
     109: invokevirtual #32                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     112: ifeq          149
     115: aload_0
     116: getfield      #12                 // Field a:Lryey/easer/plugins/event/k/e;
     119: astore_1
     120: iload         5
     122: istore_3
     123: aload_0
     124: getfield      #12                 // Field a:Lryey/easer/plugins/event/k/e;
     127: invokestatic  #60                 // Method ryey/easer/plugins/event/k/e.c:(Lryey/easer/plugins/event/k/e;)Lryey/easer/commons/local_plugin/eventplugin/EventData;
     130: checkcast     #37                 // class ryey/easer/plugins/event/k/a
     133: getfield      #40                 // Field ryey/easer/plugins/event/k/a.a:Lryey/easer/plugins/event/k/a$a;
     136: getstatic     #62                 // Field ryey/easer/plugins/event/k/a$a.c:Lryey/easer/plugins/event/k/a$a;
     139: if_acmpne     144
     142: iconst_1
     143: istore_3
     144: aload_1
     145: iload_3
     146: invokestatic  #64                 // Method ryey/easer/plugins/event/k/e.c:(Lryey/easer/plugins/event/k/e;Z)V
     149: return
}
