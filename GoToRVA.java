//Go To RVA
//@author Rosalie
//@category Navigation
//@keybinding ctrl g
//@menupath Navigation.Go To RVA
//@toolbar 

import ghidra.app.script.GhidraScript;
import ghidra.program.model.util.*;
import ghidra.program.model.reloc.*;
import ghidra.program.model.data.*;
import ghidra.program.model.block.*;
import ghidra.program.model.symbol.*;
import ghidra.program.model.scalar.*;
import ghidra.program.model.mem.*;
import ghidra.program.model.listing.*;
import ghidra.program.model.lang.*;
import ghidra.program.model.pcode.*;
import ghidra.program.model.address.*;

public class GoToRVA extends GhidraScript
{
    public void run() throws Exception
    {
		Address rva = askAddress("Go To RVA", "Enter RVA");
		Address imageBase = currentProgram.getImageBase();

		goTo(imageBase.add(rva.getOffset()));
    }

}
