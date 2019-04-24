class ryey.easer.plugins.a.i.e$1 extends android.content.BroadcastReceiver {
  final ryey.easer.plugins.a.i.e a;

  ryey.easer.plugins.a.i.e$1(ryey.easer.plugins.a.i.e);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Lryey/easer/plugins/a/i/e;
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
      21: ifeq          59
      24: aload_0
      25: getfield      #12                 // Field a:Lryey/easer/plugins/a/i/e;
      28: astore_1
      29: aload_0
      30: getfield      #12                 // Field a:Lryey/easer/plugins/a/i/e;
      33: invokestatic  #35                 // Method ryey/easer/plugins/a/i/e.a:(Lryey/easer/plugins/a/i/e;)Lryey/easer/commons/local_plugin/a/a;
      36: checkcast     #37                 // class ryey/easer/plugins/a/i/a
      39: getfield      #40                 // Field ryey/easer/plugins/a/i/a.a:Lryey/easer/plugins/a/i/a$a;
      42: getstatic     #43                 // Field ryey/easer/plugins/a/i/a$a.a:Lryey/easer/plugins/a/i/a$a;
      45: if_acmpne     50
      48: iconst_1
      49: istore_3
      50: aload_1
      51: iload_3
      52: invokestatic  #49                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      55: invokestatic  #52                 // Method ryey/easer/plugins/a/i/e.a:(Lryey/easer/plugins/a/i/e;Ljava/lang/Boolean;)V
      58: return
      59: ldc           #54                 // String android.intent.action.SCREEN_OFF
      61: aload_2
      62: invokevirtual #26                 // Method android/content/Intent.getAction:()Ljava/lang/String;
      65: invokevirtual #32                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      68: ifeq          109
      71: aload_0
      72: getfield      #12                 // Field a:Lryey/easer/plugins/a/i/e;
      75: astore_1
      76: iload         4
      78: istore_3
      79: aload_0
      80: getfield      #12                 // Field a:Lryey/easer/plugins/a/i/e;
      83: invokestatic  #57                 // Method ryey/easer/plugins/a/i/e.b:(Lryey/easer/plugins/a/i/e;)Lryey/easer/commons/local_plugin/a/a;
      86: checkcast     #37                 // class ryey/easer/plugins/a/i/a
      89: getfield      #40                 // Field ryey/easer/plugins/a/i/a.a:Lryey/easer/plugins/a/i/a$a;
      92: getstatic     #59                 // Field ryey/easer/plugins/a/i/a$a.b:Lryey/easer/plugins/a/i/a$a;
      95: if_acmpne     100
      98: iconst_1
      99: istore_3
     100: aload_1
     101: iload_3
     102: invokestatic  #49                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
     105: invokestatic  #61                 // Method ryey/easer/plugins/a/i/e.b:(Lryey/easer/plugins/a/i/e;Ljava/lang/Boolean;)V
     108: return
     109: ldc           #63                 // String android.intent.action.USER_PRESENT
     111: aload_2
     112: invokevirtual #26                 // Method android/content/Intent.getAction:()Ljava/lang/String;
     115: invokevirtual #32                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     118: ifeq          158
     121: aload_0
     122: getfield      #12                 // Field a:Lryey/easer/plugins/a/i/e;
     125: astore_1
     126: iload         5
     128: istore_3
     129: aload_0
     130: getfield      #12                 // Field a:Lryey/easer/plugins/a/i/e;
     133: invokestatic  #66                 // Method ryey/easer/plugins/a/i/e.c:(Lryey/easer/plugins/a/i/e;)Lryey/easer/commons/local_plugin/a/a;
     136: checkcast     #37                 // class ryey/easer/plugins/a/i/a
     139: getfield      #40                 // Field ryey/easer/plugins/a/i/a.a:Lryey/easer/plugins/a/i/a$a;
     142: getstatic     #68                 // Field ryey/easer/plugins/a/i/a$a.c:Lryey/easer/plugins/a/i/a$a;
     145: if_acmpne     150
     148: iconst_1
     149: istore_3
     150: aload_1
     151: iload_3
     152: invokestatic  #49                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
     155: invokestatic  #70                 // Method ryey/easer/plugins/a/i/e.c:(Lryey/easer/plugins/a/i/e;Ljava/lang/Boolean;)V
     158: return
}
