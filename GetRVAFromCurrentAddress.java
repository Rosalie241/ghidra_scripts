//Get RVA From Current Address
//@author Rosalie
//@category Navigation
//@keybinding
//@menupath Navigation.Get RVA From Current Address
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

public class GetRVAFromCurrentAddress extends GhidraScript
{
    public void run() throws Exception
    {
    	Address va = currentAddress;
		Address imageBase = currentProgram.getImageBase();
		long rva = va.subtract(imageBase);
		askString("RVA", "RVA", Long.toHexString(rva));
    }

}
