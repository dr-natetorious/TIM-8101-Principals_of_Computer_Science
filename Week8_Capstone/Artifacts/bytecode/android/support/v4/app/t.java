public abstract class android.support.v4.app.t extends android.support.v4.view.q {
  public android.support.v4.app.t(android.support.v4.app.n);
    Code:
       0: aload_0
       1: invokespecial #20                 // Method android/support/v4/view/q."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #22                 // Field b:Landroid/support/v4/app/u;
       9: aload_0
      10: new           #24                 // class java/util/ArrayList
      13: dup
      14: invokespecial #25                 // Method java/util/ArrayList."<init>":()V
      17: putfield      #27                 // Field c:Ljava/util/ArrayList;
      20: aload_0
      21: new           #24                 // class java/util/ArrayList
      24: dup
      25: invokespecial #25                 // Method java/util/ArrayList."<init>":()V
      28: putfield      #29                 // Field d:Ljava/util/ArrayList;
      31: aload_0
      32: aconst_null
      33: putfield      #31                 // Field e:Landroid/support/v4/app/i;
      36: aload_0
      37: aload_1
      38: putfield      #33                 // Field a:Landroid/support/v4/app/n;
      41: return

  public abstract android.support.v4.app.i a(int);

  public void destroyItem(android.view.ViewGroup, int, java.lang.Object);
    Code:
       0: aload_3
       1: checkcast     #39                 // class android/support/v4/app/i
       4: astore_3
       5: aload_0
       6: getfield      #22                 // Field b:Landroid/support/v4/app/u;
       9: ifnonnull     23
      12: aload_0
      13: aload_0
      14: getfield      #33                 // Field a:Landroid/support/v4/app/n;
      17: invokevirtual #44                 // Method android/support/v4/app/n.a:()Landroid/support/v4/app/u;
      20: putfield      #22                 // Field b:Landroid/support/v4/app/u;
      23: aload_0
      24: getfield      #27                 // Field c:Ljava/util/ArrayList;
      27: invokevirtual #48                 // Method java/util/ArrayList.size:()I
      30: iload_2
      31: if_icmpgt     46
      34: aload_0
      35: getfield      #27                 // Field c:Ljava/util/ArrayList;
      38: aconst_null
      39: invokevirtual #52                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      42: pop
      43: goto          23
      46: aload_0
      47: getfield      #27                 // Field c:Ljava/util/ArrayList;
      50: astore        4
      52: aload_3
      53: invokevirtual #56                 // Method android/support/v4/app/i.isAdded:()Z
      56: ifeq          71
      59: aload_0
      60: getfield      #33                 // Field a:Landroid/support/v4/app/n;
      63: aload_3
      64: invokevirtual #59                 // Method android/support/v4/app/n.a:(Landroid/support/v4/app/i;)Landroid/support/v4/app/i$d;
      67: astore_1
      68: goto          73
      71: aconst_null
      72: astore_1
      73: aload         4
      75: iload_2
      76: aload_1
      77: invokevirtual #63                 // Method java/util/ArrayList.set:(ILjava/lang/Object;)Ljava/lang/Object;
      80: pop
      81: aload_0
      82: getfield      #29                 // Field d:Ljava/util/ArrayList;
      85: iload_2
      86: aconst_null
      87: invokevirtual #63                 // Method java/util/ArrayList.set:(ILjava/lang/Object;)Ljava/lang/Object;
      90: pop
      91: aload_0
      92: getfield      #22                 // Field b:Landroid/support/v4/app/u;
      95: aload_3
      96: invokevirtual #68                 // Method android/support/v4/app/u.a:(Landroid/support/v4/app/i;)Landroid/support/v4/app/u;
      99: pop
     100: return

  public void finishUpdate(android.view.ViewGroup);
    Code:
       0: aload_0
       1: getfield      #22                 // Field b:Landroid/support/v4/app/u;
       4: ifnull        19
       7: aload_0
       8: getfield      #22                 // Field b:Landroid/support/v4/app/u;
      11: invokevirtual #72                 // Method android/support/v4/app/u.e:()V
      14: aload_0
      15: aconst_null
      16: putfield      #22                 // Field b:Landroid/support/v4/app/u;
      19: return

  public java.lang.Object instantiateItem(android.view.ViewGroup, int);
    Code:
       0: aload_0
       1: getfield      #29                 // Field d:Ljava/util/ArrayList;
       4: invokevirtual #48                 // Method java/util/ArrayList.size:()I
       7: iload_2
       8: if_icmple     29
      11: aload_0
      12: getfield      #29                 // Field d:Ljava/util/ArrayList;
      15: iload_2
      16: invokevirtual #78                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      19: checkcast     #39                 // class android/support/v4/app/i
      22: astore_3
      23: aload_3
      24: ifnull        29
      27: aload_3
      28: areturn
      29: aload_0
      30: getfield      #22                 // Field b:Landroid/support/v4/app/u;
      33: ifnonnull     47
      36: aload_0
      37: aload_0
      38: getfield      #33                 // Field a:Landroid/support/v4/app/n;
      41: invokevirtual #44                 // Method android/support/v4/app/n.a:()Landroid/support/v4/app/u;
      44: putfield      #22                 // Field b:Landroid/support/v4/app/u;
      47: aload_0
      48: iload_2
      49: invokevirtual #80                 // Method a:(I)Landroid/support/v4/app/i;
      52: astore_3
      53: aload_0
      54: getfield      #27                 // Field c:Ljava/util/ArrayList;
      57: invokevirtual #48                 // Method java/util/ArrayList.size:()I
      60: iload_2
      61: if_icmple     88
      64: aload_0
      65: getfield      #27                 // Field c:Ljava/util/ArrayList;
      68: iload_2
      69: invokevirtual #78                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      72: checkcast     #82                 // class android/support/v4/app/i$d
      75: astore        4
      77: aload         4
      79: ifnull        88
      82: aload_3
      83: aload         4
      85: invokevirtual #86                 // Method android/support/v4/app/i.setInitialSavedState:(Landroid/support/v4/app/i$d;)V
      88: aload_0
      89: getfield      #29                 // Field d:Ljava/util/ArrayList;
      92: invokevirtual #48                 // Method java/util/ArrayList.size:()I
      95: iload_2
      96: if_icmpgt     111
      99: aload_0
     100: getfield      #29                 // Field d:Ljava/util/ArrayList;
     103: aconst_null
     104: invokevirtual #52                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     107: pop
     108: goto          88
     111: aload_3
     112: iconst_0
     113: invokevirtual #90                 // Method android/support/v4/app/i.setMenuVisibility:(Z)V
     116: aload_3
     117: iconst_0
     118: invokevirtual #93                 // Method android/support/v4/app/i.setUserVisibleHint:(Z)V
     121: aload_0
     122: getfield      #29                 // Field d:Ljava/util/ArrayList;
     125: iload_2
     126: aload_3
     127: invokevirtual #63                 // Method java/util/ArrayList.set:(ILjava/lang/Object;)Ljava/lang/Object;
     130: pop
     131: aload_0
     132: getfield      #22                 // Field b:Landroid/support/v4/app/u;
     135: aload_1
     136: invokevirtual #98                 // Method android/view/ViewGroup.getId:()I
     139: aload_3
     140: invokevirtual #101                // Method android/support/v4/app/u.a:(ILandroid/support/v4/app/i;)Landroid/support/v4/app/u;
     143: pop
     144: aload_3
     145: areturn

  public boolean isViewFromObject(android.view.View, java.lang.Object);
    Code:
       0: aload_2
       1: checkcast     #39                 // class android/support/v4/app/i
       4: invokevirtual #107                // Method android/support/v4/app/i.getView:()Landroid/view/View;
       7: aload_1
       8: if_acmpne     13
      11: iconst_1
      12: ireturn
      13: iconst_0
      14: ireturn

  public void restoreState(android.os.Parcelable, java.lang.ClassLoader);
    Code:
       0: aload_1
       1: ifnull        217
       4: aload_1
       5: checkcast     #111                // class android/os/Bundle
       8: astore_1
       9: aload_1
      10: aload_2
      11: invokevirtual #115                // Method android/os/Bundle.setClassLoader:(Ljava/lang/ClassLoader;)V
      14: aload_1
      15: ldc           #117                // String states
      17: invokevirtual #121                // Method android/os/Bundle.getParcelableArray:(Ljava/lang/String;)[Landroid/os/Parcelable;
      20: astore_2
      21: aload_0
      22: getfield      #27                 // Field c:Ljava/util/ArrayList;
      25: invokevirtual #124                // Method java/util/ArrayList.clear:()V
      28: aload_0
      29: getfield      #29                 // Field d:Ljava/util/ArrayList;
      32: invokevirtual #124                // Method java/util/ArrayList.clear:()V
      35: aload_2
      36: ifnull        68
      39: iconst_0
      40: istore_3
      41: iload_3
      42: aload_2
      43: arraylength
      44: if_icmpge     68
      47: aload_0
      48: getfield      #27                 // Field c:Ljava/util/ArrayList;
      51: aload_2
      52: iload_3
      53: aaload
      54: checkcast     #82                 // class android/support/v4/app/i$d
      57: invokevirtual #52                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      60: pop
      61: iload_3
      62: iconst_1
      63: iadd
      64: istore_3
      65: goto          41
      68: aload_1
      69: invokevirtual #128                // Method android/os/Bundle.keySet:()Ljava/util/Set;
      72: invokeinterface #134,  1          // InterfaceMethod java/lang/Iterable.iterator:()Ljava/util/Iterator;
      77: astore_2
      78: aload_2
      79: invokeinterface #139,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      84: ifeq          217
      87: aload_2
      88: invokeinterface #143,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      93: checkcast     #145                // class java/lang/String
      96: astore        4
      98: aload         4
     100: ldc           #147                // String f
     102: invokevirtual #151                // Method java/lang/String.startsWith:(Ljava/lang/String;)Z
     105: ifeq          78
     108: aload         4
     110: iconst_1
     111: invokevirtual #155                // Method java/lang/String.substring:(I)Ljava/lang/String;
     114: invokestatic  #161                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
     117: istore_3
     118: aload_0
     119: getfield      #33                 // Field a:Landroid/support/v4/app/n;
     122: aload_1
     123: aload         4
     125: invokevirtual #164                // Method android/support/v4/app/n.a:(Landroid/os/Bundle;Ljava/lang/String;)Landroid/support/v4/app/i;
     128: astore        5
     130: aload         5
     132: ifnull        178
     135: aload_0
     136: getfield      #29                 // Field d:Ljava/util/ArrayList;
     139: invokevirtual #48                 // Method java/util/ArrayList.size:()I
     142: iload_3
     143: if_icmpgt     158
     146: aload_0
     147: getfield      #29                 // Field d:Ljava/util/ArrayList;
     150: aconst_null
     151: invokevirtual #52                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
     154: pop
     155: goto          135
     158: aload         5
     160: iconst_0
     161: invokevirtual #90                 // Method android/support/v4/app/i.setMenuVisibility:(Z)V
     164: aload_0
     165: getfield      #29                 // Field d:Ljava/util/ArrayList;
     168: iload_3
     169: aload         5
     171: invokevirtual #63                 // Method java/util/ArrayList.set:(ILjava/lang/Object;)Ljava/lang/Object;
     174: pop
     175: goto          78
     178: new           #166                // class java/lang/StringBuilder
     181: dup
     182: invokespecial #167                // Method java/lang/StringBuilder."<init>":()V
     185: astore        5
     187: aload         5
     189: ldc           #169                // String Bad fragment at key
     191: invokevirtual #173                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     194: pop
     195: aload         5
     197: aload         4
     199: invokevirtual #173                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     202: pop
     203: ldc           #175                // String FragmentStatePagerAdapt
     205: aload         5
     207: invokevirtual #179                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     210: invokestatic  #185                // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
     213: pop
     214: goto          78
     217: return

  public android.os.Parcelable saveState();
    Code:
       0: aload_0
       1: getfield      #27                 // Field c:Ljava/util/ArrayList;
       4: invokevirtual #48                 // Method java/util/ArrayList.size:()I
       7: ifle          48
      10: new           #111                // class android/os/Bundle
      13: dup
      14: invokespecial #188                // Method android/os/Bundle."<init>":()V
      17: astore_3
      18: aload_0
      19: getfield      #27                 // Field c:Ljava/util/ArrayList;
      22: invokevirtual #48                 // Method java/util/ArrayList.size:()I
      25: anewarray     #82                 // class android/support/v4/app/i$d
      28: astore_2
      29: aload_0
      30: getfield      #27                 // Field c:Ljava/util/ArrayList;
      33: aload_2
      34: invokevirtual #192                // Method java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
      37: pop
      38: aload_3
      39: ldc           #117                // String states
      41: aload_2
      42: invokevirtual #196                // Method android/os/Bundle.putParcelableArray:(Ljava/lang/String;[Landroid/os/Parcelable;)V
      45: goto          50
      48: aconst_null
      49: astore_3
      50: iconst_0
      51: istore_1
      52: iload_1
      53: aload_0
      54: getfield      #29                 // Field d:Ljava/util/ArrayList;
      57: invokevirtual #48                 // Method java/util/ArrayList.size:()I
      60: if_icmpge     153
      63: aload_0
      64: getfield      #29                 // Field d:Ljava/util/ArrayList;
      67: iload_1
      68: invokevirtual #78                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      71: checkcast     #39                 // class android/support/v4/app/i
      74: astore        4
      76: aload_3
      77: astore_2
      78: aload         4
      80: ifnull        144
      83: aload_3
      84: astore_2
      85: aload         4
      87: invokevirtual #56                 // Method android/support/v4/app/i.isAdded:()Z
      90: ifeq          144
      93: aload_3
      94: astore_2
      95: aload_3
      96: ifnonnull     107
      99: new           #111                // class android/os/Bundle
     102: dup
     103: invokespecial #188                // Method android/os/Bundle."<init>":()V
     106: astore_2
     107: new           #166                // class java/lang/StringBuilder
     110: dup
     111: invokespecial #167                // Method java/lang/StringBuilder."<init>":()V
     114: astore_3
     115: aload_3
     116: ldc           #147                // String f
     118: invokevirtual #173                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     121: pop
     122: aload_3
     123: iload_1
     124: invokevirtual #199                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     127: pop
     128: aload_3
     129: invokevirtual #179                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     132: astore_3
     133: aload_0
     134: getfield      #33                 // Field a:Landroid/support/v4/app/n;
     137: aload_2
     138: aload_3
     139: aload         4
     141: invokevirtual #202                // Method android/support/v4/app/n.a:(Landroid/os/Bundle;Ljava/lang/String;Landroid/support/v4/app/i;)V
     144: iload_1
     145: iconst_1
     146: iadd
     147: istore_1
     148: aload_2
     149: astore_3
     150: goto          52
     153: aload_3
     154: areturn

  public void setPrimaryItem(android.view.ViewGroup, int, java.lang.Object);
    Code:
       0: aload_3
       1: checkcast     #39                 // class android/support/v4/app/i
       4: astore_1
       5: aload_1
       6: aload_0
       7: getfield      #31                 // Field e:Landroid/support/v4/app/i;
      10: if_acmpeq     55
      13: aload_0
      14: getfield      #31                 // Field e:Landroid/support/v4/app/i;
      17: ifnull        36
      20: aload_0
      21: getfield      #31                 // Field e:Landroid/support/v4/app/i;
      24: iconst_0
      25: invokevirtual #90                 // Method android/support/v4/app/i.setMenuVisibility:(Z)V
      28: aload_0
      29: getfield      #31                 // Field e:Landroid/support/v4/app/i;
      32: iconst_0
      33: invokevirtual #93                 // Method android/support/v4/app/i.setUserVisibleHint:(Z)V
      36: aload_1
      37: ifnull        50
      40: aload_1
      41: iconst_1
      42: invokevirtual #90                 // Method android/support/v4/app/i.setMenuVisibility:(Z)V
      45: aload_1
      46: iconst_1
      47: invokevirtual #93                 // Method android/support/v4/app/i.setUserVisibleHint:(Z)V
      50: aload_0
      51: aload_1
      52: putfield      #31                 // Field e:Landroid/support/v4/app/i;
      55: return

  public void startUpdate(android.view.ViewGroup);
    Code:
       0: aload_1
       1: invokevirtual #98                 // Method android/view/ViewGroup.getId:()I
       4: iconst_m1
       5: if_icmpne     48
       8: new           #166                // class java/lang/StringBuilder
      11: dup
      12: invokespecial #167                // Method java/lang/StringBuilder."<init>":()V
      15: astore_1
      16: aload_1
      17: ldc           #206                // String ViewPager with adapter
      19: invokevirtual #173                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      22: pop
      23: aload_1
      24: aload_0
      25: invokevirtual #209                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      28: pop
      29: aload_1
      30: ldc           #211                // String  requires a view id
      32: invokevirtual #173                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      35: pop
      36: new           #213                // class java/lang/IllegalStateException
      39: dup
      40: aload_1
      41: invokevirtual #179                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      44: invokespecial #216                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      47: athrow
      48: return
}
