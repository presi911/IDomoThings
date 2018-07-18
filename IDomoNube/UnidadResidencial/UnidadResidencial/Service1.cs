using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace UnidadResidencial
{
    // NOTA: puede usar el comando "Rename" del menú "Refactorizar" para cambiar el nombre de clase "Service1" en el código y en el archivo de configuración a la vez.
    public class Service1 : IService1
    {
        FalsoRepositorio db1 = new FalsoRepositorio();
        public string[] CrearUnidad(string id, string description)
        {
            //Unidad unidad = new Unidad(id, description);
            return db1.Add(id, description);
        }

        public string[] GetAll()
        {
            return db1.GetAll();
        }

        public UnidadResidencial GetUnidad(string id)
        {
            UnidadResidencial found = db1.Search(id);
            return found;
        }
    }
}
