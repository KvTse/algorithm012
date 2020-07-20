学习笔记
    递归: 
    模板代码:
    public void recur(int level, int param) { 
      // terminator 递归中介
      if (level > MAX_LEVEL) { 
        // process result 
        return; 
      }
      // process current logic 当前层逻辑 
      process(level, param); 
      // drill down  递归进入下一层
      recur( level + 1, newParam); 
      // restore current status 
     
    }