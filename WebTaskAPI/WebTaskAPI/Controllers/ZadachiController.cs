using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using WebTaskAPI.Models.Zadacha;

namespace WebTaskAPI.Controllers;

[Route("api/[controller]")]
[ApiController]
public class ZadachiController : ControllerBase
{
    [HttpGet]
    public IActionResult GetList()
    {
        var items = new List<ZadachaItemModel>
        {
            new() { Id = 1, Name = "Зробити домашку" },
            new() { Id = 2, Name = "Прибрати в кімнаті" },
            new() { Id = 3, Name = "Піти гуляти з дівчиною" },
        };

        return Ok(items);
    }
}
